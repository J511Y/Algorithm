import java.util.*;
import java.io.*;
public class Main {
	static int[] time, dp;
	static int[][] parent;
	static int Int(String s) { return Integer.parseInt(s); }
	static int getTime(int w) {
		if (dp[w] != -1) return dp[w];
		int max = 0;
		for(int i = 0; i < time.length; i++) {
			if (parent[w][i] != -1) {
				max = Math.max(max, getTime(i));
			}
		}
		return dp[w] = max + time[w];
	}
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Int(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Int(st.nextToken()), k = Int(st.nextToken());
			time = new int[n];
			dp = new int[n];
			Arrays.fill(dp, -1);
			parent = new int[n][n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				time[i] = Int(st.nextToken());
				Arrays.fill(parent[i], -1);
			}
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Int(st.nextToken()) - 1, b = Int(st.nextToken()) - 1;
				parent[b][a] = a;
			}
			int w = Int(br.readLine()) - 1;
			sb.append(getTime(w)).append("\n");
		}
		System.out.print(sb);
	}
}