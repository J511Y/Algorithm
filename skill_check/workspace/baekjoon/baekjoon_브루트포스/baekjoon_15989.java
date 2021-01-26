package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_15989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] dp = new int[10001][4];
		dp[1][2] = dp[1][3] = dp[2][3] = 0;
		dp[1][1] = dp[2][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
		for(int i = 4; i < 10001; i++) {
			dp[i][1] = dp[i-1][1];
			dp[i][2] = dp[i-2][1] + dp[i-2][2];
			dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
		}
		while(t-->0) {
			int n = sc.nextInt();
			System.out.println(dp[n][1] + dp[n][2] + dp[n][3]);
		}
	}
}