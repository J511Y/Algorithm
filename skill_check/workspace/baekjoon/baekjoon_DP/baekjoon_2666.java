package baekjoon_DP;
// https://www.acmicpc.net/problem/2666
// 벽장문의 이동
import java.util.*;
public class baekjoon_2666 {
	static int[] arr;
	static int DP(int a, int b, int n, int val) {
		if(n == arr.length) return val;
		int min = 1 << 30, idx = arr[n];
		int A = Math.min(a, b), B = Math.max(a, b);
		if(A < idx && B < idx) min = Math.min(min, DP(A, idx, n + 1, val + idx - B));
		if(idx < A && idx < B) min = Math.min(min, DP(idx, B, n + 1, val + A - idx));
		if(A < idx && idx < B) {
			min = Math.min(min, DP(idx, B, n + 1, val + idx - A));
			min = Math.min(min, DP(A, idx, n + 1, val + B - idx));
		}
		return min == 1 << 30 ? DP(A, B, n + 1, val) : min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), tc = sc.nextInt();
		arr = new int[tc];
		for(int i = 0; i < tc; i++) arr[i] = sc.nextInt();
		System.out.println(DP(a, b, 0, 0));
	}
}
