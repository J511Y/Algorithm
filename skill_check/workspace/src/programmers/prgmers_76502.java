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
	        // ¦���� �ƴϸ� ������ ����
	        if(len % 2 == 1) return 0;
	        
	        // �⺻ Ǯ���� ����
	        Stack<Character> stack = new Stack<>();
	        // ���� �ʴ� ���ڿ����� ������ ���� ť
	        Queue<Character> queue = new LinkedList<>();
	        for(char c : s.toCharArray()) {
	            // ������ ����ִ�
	            if(stack.isEmpty()) {
	            	// ���� Ǯ�̿� ����
	                if(isOpen(c)) stack.push(c);
	                // �ݴ� ��ȣ�ε� ������ ����ִ�? �ӽ������� ���� arr�� ���� �־���
	                else {
	                	// ())( �� ���� ��츦 ����� cnt�� 0���� �ʱ�ȭ
	                    cnt = 0;
	                    queue.add(c);
	                }
	            } else {
	            	// ���� Ǯ�̿� ����
	                if(isOpen(c)) stack.push(c);
	                else if(isPair(stack.peek(), c)) {
	                    stack.pop();
	                    // ������ ����ִٸ� �Ϻ��� ��ȣ �׷� cnt 1 �߰� -> ex ()()
	                    if(stack.isEmpty()) cnt++;
	                // �� �� �ƴ� ���� �Ұ����� �����. �������� 0 ����
	                } else return 0;
	            }
	        }
	        
	        // ť�� ������� �ʴٸ� ���� + ť�� 1�׷��� ���� �� �����Ƿ� cnt++
	        if(!queue.isEmpty()) cnt++;
	        
	        // ���ð� ť�� ���� ¦�� �´� �� Ȯ��
	        while(!queue.isEmpty() && !stack.isEmpty()) {
	            char a = stack.pop(), b = queue.poll();
	            // ¦�� ���� �ʴ´ٸ� �Ұ���
	            if(!isPair(a, b)) return 0;
	        }
	        // ������ �ȸ¾Ƽ� �� �ʿ� �����ִٸ� �Ұ���
	        if(!queue.isEmpty() || !stack.isEmpty()) return 0;
	        
	        // �������� ��� ���� �����̹Ƿ� cnt ����
	        return cnt;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
