package baekjoon_DP;
import java.util.*;
public class baekjoon_1149 {
	static int[][] house, dp;
	static int DP(int n, int m) {
		if(dp[n][m] != 0) return dp[n][m];
		return dp[n][m] = Math.min(DP(n-1, (m + 1) % 3), DP(n-1, (m + 2) % 3)) + house[n][m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		house = new int[n+1][3];
		for(int i = 0; i < n * 3; i++) house[i/3][i%3] = sc.nextInt();
		dp = new int[n+1][3];
		dp[0] = house[0];
		for(int i = 0; i < 3; i++) DP(n, i);
		System.out.print(Arrays.stream(dp[n]).min().getAsInt());
	}
}
