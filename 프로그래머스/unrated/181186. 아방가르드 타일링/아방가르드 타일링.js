function solution(n, dp = [0, 1, 3, 10, 23, 62, ...Array(n)], mem = [1, 1, 3], mod = 1000000007) {
    for(let i = 6; i <= n; i++) {
        let sum = mem.map((x, j) => x * (j % 3 == i % 3 ? 4 : 2)).reduce((p, c) => p + c);
        let next = dp[i-1] + dp[i-2] * 2 + dp[i-3] * 5 + sum;
        next %= mod;
        mem[i % 3] = (mem[i % 3] + dp[i - 3]) % mod;
        dp[i] = next;
    }
    return dp[n];
}