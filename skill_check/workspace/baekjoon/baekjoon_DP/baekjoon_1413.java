package baekjoon_DP;
// https://www.acmicpc.net/problem/1413
// 박스 안의 열쇠
import java.util.*;
public class baekjoon_1413 {
	static long[][] dp = new long[21][21];
	static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	static long func(int n, int m) {
		if(n == 0) return 1;
		if(m == 0) return 0;
		if(dp[n][m] != -1) return dp[n][m];
		return dp[n][m] = func(n - 1, m - 1) + (n - 1) * func(n - 1, m);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		for(long[] d : dp) Arrays.fill(d, -1);
		long all = func(n, n), part = func(n, m), div = gcd(all, part);
		System.out.println((part/div) + "/" + (all/div));
	}
}
