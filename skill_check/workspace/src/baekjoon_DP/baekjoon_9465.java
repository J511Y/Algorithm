package baekjoon_DP;
// https://www.acmicpc.net/problem/9465
// ½ºÆ¼Ä¿
import java.util.*;
import java.io.*;
public class baekjoon_9465 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Int(br.readLine());
		for(int i = 0; i < tc; i++) {
			int n = Int(br.readLine());
			int[][] arr = new int[2][100001], dp = new int[2][100010];
			for(int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k = 2; k < n + 2; k++) arr[j][k] = Int(st.nextToken());
			}
			for(int j = 2; j < n + 2; j++) {
				dp[0][j] = Math.max(Math.max(dp[0][j-1], dp[1][j-1] + arr[0][j]), dp[1][j-2] + arr[0][j]);
				dp[1][j] = Math.max(Math.max(dp[1][j-1], dp[0][j-1] + arr[1][j]), dp[0][j-2] + arr[1][j]);
			}
			System.out.println(Math.max(dp[0][n+1], dp[1][n+1]));
		}
	}
}
