package baekjoon_DP;
// https://www.acmicpc.net/problem/4485
// ³ì»ö ¿Ê ÀÔÀº ¾Ö°¡ Á©´ÙÁö?
import java.util.*;
import java.io.*;
public class baekjoon_4485 {
	static int Int(String s) {
		return Integer.parseInt(s);
	}
	static boolean isRange(int a, int b, int n) {
		return 0 <= a && 0 <= b && a < n && b < n;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
		int max = Integer.MAX_VALUE, round = 1;
		while(true) {
			int n = Int(br.readLine());
			if(n == 0) return;
			int[][] map = new int[n][n], dp = new int[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Int(st.nextToken());
					dp[i][j] = max;
				}
			}
			dp[0][0] = map[0][0];
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {0, 0, dp[0][0]});
			while(!q.isEmpty()) {
				int[] poll = q.poll();
				int a = poll[0], b = poll[1], val = poll[2];
				if(dp[a][b] < val) continue;
				for(int i = 0; i < 4; i++) {
					int A = a + WH[0][i], B = b + WH[1][i];
					if(isRange(A, B, n) && val + map[A][B] < dp[A][B]) {
						q.add(new int[] {A, B, val + map[A][B]});
						dp[A][B] = val + map[A][B];
					}
				}
			}
			System.out.println("Problem " + round++ + ": " + dp[n-1][n-1]);
		}
	}
}
