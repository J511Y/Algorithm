package baekjoon_stack;

import java.util.*;

// https://www.acmicpc.net/problem/1874
public class baekjoon_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		int last = 1;
		int idx = 0;

		while (last <= n) {
			stack.push(last++);
			sb.append("+");
			while (!stack.empty() && stack.peek() == arr[idx]) {
				idx++;
				stack.pop();
				sb.append("-");
			}
		}

		if (!stack.empty())
			System.out.println("NO");
		else {
			for (char c : sb.toString().toCharArray())
				System.out.println(c);
		}
	}
}
