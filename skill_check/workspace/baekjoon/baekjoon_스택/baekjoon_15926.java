package baekjoon_Ω∫≈√;

import java.util.*;
public class baekjoon_15926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0, len = 0;
		char[] arr = sc.next().toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			if(stack.isEmpty()) {
				if(arr[i] == '(') {
					stack.push('(');
					len++;
				} else max = Math.max(max, len);
			} else {
				if(arr[i] == ')') {
					if(stack.peek() == '(') {
						stack.pop();
						len++;						
					} else {
						
					}
				} else {
				}
			}
		}
	}
}
