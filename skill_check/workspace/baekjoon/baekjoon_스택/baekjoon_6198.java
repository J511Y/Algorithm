package baekjoon_Ω∫≈√;

import java.util.*;
public class baekjoon_6198 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Stack<int[]> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			int next = sc.nextInt();
			while(!stack.isEmpty() && stack.peek()[1] <= next) {
				int[] p = stack.pop();
				arr[p[0]] = i - p[0] - 1;
			}
			stack.push(new int[] {i, next});
		}
		while(!stack.isEmpty()) {
			int[] p = stack.pop();
			arr[p[0]] = n - p[0] - 1;
		}
		long answer = 0;
		for(int i : arr) answer += i;
		System.out.print(answer);
	}
}
