package baekjoon_DP;
import java.util.*;
public class baekjoon_18353 {
	static int n;
	static int[] arr, dp;
	static int dp(int x) {
		if(dp[x] != 0) return x;
		if(x == n - 1) return dp[x] = 1;
		return Math.max(dp[x], dp(x) + 1);
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		dp = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(dp(0));
	}
}
