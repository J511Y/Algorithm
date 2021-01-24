package baekjoon_DP;

public class baekjoon_20500 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt(), mod = 1000000007;
		long[] dp = new long[1516];
		dp[2] = dp[3] = 1;
		for(int i = 4; i <= n; i++) dp[i] = (dp[i-2] * 2 + dp[i-1]) % mod;
		System.out.println(dp[n]);
	}
}
