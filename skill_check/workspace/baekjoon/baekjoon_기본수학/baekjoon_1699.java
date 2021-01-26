package baekjoon_기본수학;
// https://www.acmicpc.net/problem/1699
// 제곱수의 합
/*
 * 문제 풀기 전 생각 2020.03.18 23:12
 * ----------------------
 * 제곱근에 제일 가까운 수로 계속 빼보면 되지 않을까 생각
 */
public class baekjoon_1699 {
	// recursion
	static int min = 999;
	static void func(int n, int cnt) {
		if(cnt >= min) return;
		if(n == 0) min = Math.min(min, cnt);
		int root = (int)Math.sqrt(n) + 1;
		for(; root > 0; root--) func(n - (root * root), cnt + 1);
	}
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("===========bottom-up============");
		double start = System.currentTimeMillis();
		func(n);
		double end = System.currentTimeMillis();
		System.out.println("time : " + (end - start) / 1000 + "s");
		
		
		System.out.println("===========recursion============");
		start = System.currentTimeMillis();
		func(n, 0);
		end = System.currentTimeMillis();
		System.out.println(min);
		System.out.println("time : " + (end - start) / 1000 + "s");
	}
	
	// bottom-up
	static void func(int n) {
		int[] dp = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			dp[i] = i;
			for(int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
			}
		}
		System.out.println(dp[n]);
	}
}