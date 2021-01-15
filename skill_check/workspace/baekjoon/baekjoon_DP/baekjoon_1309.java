package baekjoon_DP;
// https://www.acmicpc.net/problem/1309
// µ¿¹°¿ø

public class baekjoon_1309 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int[] dp = new int[100001];
		dp[1] = 3; dp[2] = 7;
		for(int i = 3; i < 100001; i++) dp[i] = (dp[i-1] * 2 + dp[i-2]) % 9901;
		System.out.println(dp[n]);
	}
}
