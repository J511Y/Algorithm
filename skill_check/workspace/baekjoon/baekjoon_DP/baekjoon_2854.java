package baekjoon_DP;
// https://www.acmicpc.net/problem/2854
// 문제 출제
import java.util.*;
public class baekjoon_2854 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), mod = 1000000007;
		int[] one = new int[n], two = new int[n];
		long[][]dp = new long[n][2];
		for(int i = 0; i < n * 2 - 1; i++) (i < n ? one : two)[i%n] = sc.nextInt();
		dp[0][0] = one[0]; dp[0][1] = two[0];
		for(int i = 1; i < n; i++) {
			long before = dp[i-1][0] + dp[i-1][1];
			dp[i][0] = (before * (one[i] + two[i-1] - 1) + dp[i-1][0]) % mod;
			dp[i][1] = before * two[i] % mod;
		}
		System.out.println(dp[n-1][0]);
	}
}
