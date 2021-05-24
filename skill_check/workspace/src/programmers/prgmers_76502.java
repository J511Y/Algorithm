package programmers;

import java.util.*;
public class prgmers_76502 {
	class Solution {
		boolean isOpen(char c) {
	        return c == '[' || c == '(' || c == '{';
	    }
	    boolean isPair(char a, char b) {
	        return (a == '[' && b == ']') || (a == '(' && b == ')') || (a == '{' && b == '}');
	    }
	    public int solution(String s) {
	        int cnt = 0, len = s.length();
	        // 짝수가 아니면 무조건 실패
	        if(len % 2 == 1) return 0;
	        
	        // 기본 풀이의 스택
	        Stack<Character> stack = new Stack<>();
	        // 맞지 않는 문자열들을 가지고 있을 큐
	        Queue<Character> queue = new LinkedList<>();
	        for(char c : s.toCharArray()) {
	            // 스택이 비어있다
	            if(stack.isEmpty()) {
	            	// 기존 풀이와 동일
	                if(isOpen(c)) stack.push(c);
	                // 닫는 괄호인데 스택이 비어있다? 임시저장을 위해 arr의 끝에 넣어줌
	                else {
	                	// ())( 와 같은 경우를 대비해 cnt를 0으로 초기화
	                    cnt = 0;
	                    queue.add(c);
	                }
	            } else {
	            	// 기존 풀이와 동일
	                if(isOpen(c)) stack.push(c);
	                else if(isPair(stack.peek(), c)) {
	                    stack.pop();
	                    // 스택이 비어있다면 완벽한 괄호 그룹 cnt 1 추가 -> ex ()()
	                    if(stack.isEmpty()) cnt++;
	                // 둘 다 아닌 경우는 불가능한 경우임. 가차없이 0 리턴
	                } else return 0;
	            }
	        }
	        
	        // 큐가 비어있지 않다면 스택 + 큐로 1그룹을 만들 수 있으므로 cnt++
	        if(!queue.isEmpty()) cnt++;
	        
	        // 스택과 큐가 서로 짝이 맞는 지 확인
	        while(!queue.isEmpty() && !stack.isEmpty()) {
	            char a = stack.pop(), b = queue.poll();
	            // 짝이 맞지 않는다면 불가능
	            if(!isPair(a, b)) return 0;
	        }
	        // 개수가 안맞아서 한 쪽에 남아있다면 불가능
	        if(!queue.isEmpty() || !stack.isEmpty()) return 0;
	        
	        // 나머지는 모두 성공 조건이므로 cnt 리턴
	        return cnt;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
