import java.util.*;
class Main {
	static int n, m = 2001;
	static int[][] dp = new int[m][m];
	static int[] arr = new int[m];
	static int DP(int l, int r, int t) {
		if (l > r) return 0;
		if (dp[l][r] > 0) return dp[l][r];
		return dp[l][r] = Math.max(DP(l + 1, r, t + 1) + arr[l] * t, DP(l, r - 1, t + 1) + arr[r] * t);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.print(DP(0, n - 1, 1));
	}
}