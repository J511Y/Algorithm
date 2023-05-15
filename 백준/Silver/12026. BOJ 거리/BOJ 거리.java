import java.util.*;
class Main {
	static boolean isNext(char a, char b) {
		if (a == 'B' && b == 'O') return true;
		if (a == 'O' && b == 'J') return true;
		if (a == 'J' && b == 'B') return true;
		return false;
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), INF = 1 << 30;
		long[] dp = new long[n];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		char[] arr = sc.next().toCharArray();
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if (isNext(arr[i], arr[j])) {
					dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i));
				}
			}
		}
		System.out.print(dp[n - 1] == INF ? -1 : dp[n - 1]);
	}
}