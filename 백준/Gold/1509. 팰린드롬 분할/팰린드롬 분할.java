class Main {
	public static void main(String[] ar) {
		char[] arr = new java.util.Scanner(System.in).next().toCharArray();
		int n = arr.length, cnt = 0, l = 0;
        int[] dp = new int[n];
		boolean[][] palin = new boolean[n][n];
		for(int i = 0; i < n; i++) {
            palin[i][i] = true;
            dp[i] = i + 1;
        }
		for(int i = 1; i < n; i++) palin[i - 1][i] = arr[i - 1] == arr[i];
		for(int i = 2; i < n; i++) {
			for(int s = 0, e = s + i; e < n; s++, e++) {
				palin[s][e] = arr[s] == arr[e] && palin[s + 1][e - 1];
			}
		}
		for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if (palin[j][i]) {
                    int before = j == 0 ? 0 : dp[j - 1];
                    dp[i] = Math.min(dp[i], before + 1);
                }
            }
        }
		System.out.print(dp[n - 1]);
	}
}