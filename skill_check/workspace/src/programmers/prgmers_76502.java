package programmers;

import java.util.*;
public class prgmers_76502 {
	class Solution {
	    int answer = 0, len;
	    boolean isPair(char a, char b) {
	        return (a == '[' && b == ']') || (a == '(' && b == ')') || (a == '{' && b == '}');
	    }
	    void check(String s, int idx) {
	        Stack<Character> stack = new Stack<>();
	        for(int i = 0; i < len; i++) {
	            char c = s.charAt((i + idx) % len);
	            if(stack.isEmpty()) stack.push(c);
	            else {
	                if(isPair(stack.peek(), c)) stack.pop();
	                else stack.push(c);
	            }
	        }
	        answer += stack.isEmpty() ? 1 : 0;
	    }
	    public int solution(String s) {
	        len = s.length();
	        for(int i = 0; i < len; i++) check(s, i);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
