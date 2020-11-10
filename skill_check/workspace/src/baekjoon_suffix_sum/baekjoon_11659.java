package baekjoon_suffix_sum;

import java.util.*;
public class baekjoon_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] sum = new int[n+1];
		for(int i = 1; i < n + 1; i++) sum[i] = sum[i-1] + sc.nextInt();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(sum[b] - sum[a-1]);
		}
	}
}
