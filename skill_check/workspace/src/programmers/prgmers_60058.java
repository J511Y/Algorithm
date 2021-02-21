package programmers;
import java.util.*;
public class prgmers_60058 {
	public boolean isRight(String s) {
        int check = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') check--;
            else check++;

            if(check < 0) return false;
        }
        return true;
    }
    public String solution(String p) {
        if (p.equals("")) return p;
        Stack<Character> stack = new Stack<>();
        String p1 = "";
        String p2 = "";
        for(int i=0; i<p.length(); i++) {
            if(i==0) {
                stack.push(p.charAt(i));
                continue;
            }
            if(stack.peek() != p.charAt(i)) {
                stack.pop();
            }else {
                stack.push(p.charAt(i));
            }
            if(stack.empty()) {
                p1 = p.substring(0, i+1);
                p2 = p.substring(i+1);
                break;
            }
        }

        if(isRight(p1)) {
            return p1 + solution(p2);
        }else {
            StringBuffer sb = new StringBuffer();
            for(int i=1; i<p1.length() - 1; i++) {
                if(p1.charAt(i) == '(') sb.append(')');
                else sb.append('(');
            }
            return "(" + solution(p2) + ")" + sb.toString();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
