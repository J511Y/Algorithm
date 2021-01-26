package baekjoon_æ÷µÂ»§;

import java.util.*;
class baekjoon_1201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) arr[i] = i + 1;
		if(n <= m * k && m + k <= n + 1) {
			Arrays.sort(arr, 0, k, (a, b) -> b - a);
			int s = k;
			for(int i = 1; i < m; i++) {
				int e = s + Math.min(k, (n - s) / (m - i));
				Arrays.sort(arr, s, e, (a, b) -> b - a);
				s = e;
			}
			for(int i : arr) System.out.print(i + " ");
		} else System.out.println(-1);
	}
}