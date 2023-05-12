import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), INF = 1 << 25;
		int[][] arr = new int[50][2], dp = new int[50][2];
		for(int i = 1; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i = 0; i <= n; i++) Arrays.fill(dp[i], INF);
		dp[1][0] = 0;
		dp[2][0] = arr[1][0];
		dp[3][0] = Math.min(arr[1][1], arr[2][0] + arr[1][0]);
		int jump = sc.nextInt();
		for(int i = 4; i <= n; i++) {
			int j = i - 1, k = i - 2, big = i - 3;
			dp[i][0] = Math.min(dp[j][0] + arr[j][0], dp[k][0] + arr[k][1]);
			dp[i][1] = Math.min(Math.min(dp[j][1] + arr[j][0], dp[k][1] + arr[k][1]), dp[big][0] + jump);
		}
		System.out.print(Math.min(dp[n][1], dp[n][0]));
	}
}