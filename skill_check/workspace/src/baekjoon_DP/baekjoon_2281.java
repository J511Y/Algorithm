package baekjoon_DP;
// https://www.acmicpc.net/problem/2281
// 데스노드
import java.util.*;
public class baekjoon_2281 {
	static int n, m;
	static int[] arr;
	static int[][] dp = new int[1001][1001];
	static int DP(int idx, int cnt) {
		if(idx == n) return 0;
		int temp = dp[cnt][idx];
		if(temp != -1) return temp;
		int val = m - (cnt - 1);
		temp = DP(idx + 1, arr[idx] + 1) + (val * val);
		if(cnt + arr[idx] <= m) temp = Math.min(temp, DP(idx + 1, cnt + arr[idx] + 1)); 
		return dp[cnt][idx] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		arr = new int[n];
		for(int[] d : dp) Arrays.fill(d, -1);
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(DP(0, 0));
	}
}
