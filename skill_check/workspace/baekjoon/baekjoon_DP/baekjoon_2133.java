package baekjoon_DP;
// https://www.acmicpc.net/problem/2133
// 타일 채우기
public class baekjoon_2133 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int[] dp = new int[31];
		dp[2] = 3;
		for(int i = 4; i <= n; i += 2) {
			dp[i] = dp[i-2] * 3 + 2;
			for(int j = 4; j <= i; j += 2) {
				dp[i] += dp[i-j] * 2;
			}
		}
		System.out.println(dp[n]);
	}
}
