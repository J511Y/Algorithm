package baekjoon_DP;

import java.util.*;
public class baekjoon_1463_2 {
	static int[] dp = new int[(int)Math.pow(10, 6) + 1];
	static int func(int n) {
		System.out.println(n);
		if (dp[n] != 0) return dp[n];
		int cnt = 987654;
		if(n % 2 == 0) cnt = Math.min(cnt, func(n / 2));
		if(n % 3 == 0) cnt = Math.min(cnt, func(n / 3));
		cnt = Math.min(cnt, func(n - 1));
		return dp[n] = cnt + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp[2] = dp[3] = 1;
		System.out.println(n == 1 ? 0 : func(n));
	}
}
