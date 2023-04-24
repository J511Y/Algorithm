class Solution {
    public int solution(int n, int count) {
        long[][] dp = new long[101][101];
        dp[1][1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1, k = i - 1; j <= i; j++) {
                dp[i][j] = dp[k][j-1] + dp[k][j] * 2 * k;
                dp[i][j] %= 1000000007;
            }
        }
        return (int)dp[n][count];
    }
}