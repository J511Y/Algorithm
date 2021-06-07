package baekjoon_DP;

import java.util.*;
public class baekjoon_14699 {
	static int n;
	static int[] h, dp;
	static int[][] map;
	static int dp(int m) {
		if(dp[m] != 0) return dp[m];
		int max = 0;
		for(int i = 1; i <= n; i++) {
			if(map[m][i] != 0 && h[i] > h[m]) {
				max = Math.max(max, dp(i));
			}
		}
		return dp[m] = max + 1;
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		h = new int[n + 1];
		dp = new int[n + 1];
		for(int i = 1; i <= n; i++) h[i] = sc.nextInt();
		map = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		for(int i = 1; i <= n; i++) System.out.println(dp(i));
	}
}
