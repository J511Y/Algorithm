import java.util.*;
class Solution {
    public boolean isOk(String p) {
        Stack<Character> stack = new Stack<>();
        for(char c : p.toCharArray()) {
            if(stack.isEmpty() || c == '(') stack.add(c);
            if(c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        return true;
    }

    public int splitBalance(String p) {
        int left = 0;
        int right = 0;

        for(char c : p.toCharArray()) {
            if(c == '(') left += 1;
            else if(c == ')') right += 1;

            if(left == right) break;
        }

        return left + right;
    }

    public String solution(String p) {
        if(p.equals("")) return "";

        int splitIndex = splitBalance(p);
        String u = p.substring(0, splitIndex);
        String v = p.substring(splitIndex, p.length());

        if(isOk(u)) return u + solution(v);

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");

        for(char c : u.substring(1, splitIndex - 1).toCharArray()) {
            if(c == '(') sb.append(")");
            else sb.append("(");
        }

        return sb.toString();
    }
}