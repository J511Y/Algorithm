import java.util.*;
import java.io.*;
class Main {
	static int Int(String s) { return Integer.parseInt(s); }
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Int(br.readLine()), INF = 987654321;
		while(tc-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Int(st.nextToken()), m = Int(st.nextToken()), w = Int(st.nextToken());
			int[][] dist = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(dist[i], INF);
				dist[i][i] = 0;
			}
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int s = Int(st.nextToken()) - 1, e = Int(st.nextToken()) - 1, t = Int(st.nextToken());
				dist[e][s] = dist[s][e] = Math.min(dist[s][e], t);
			}
			for(int i = 0; i < w; i++) {
				st = new StringTokenizer(br.readLine());
				int s = Int(st.nextToken()) - 1, e = Int(st.nextToken()) - 1, t = Int(st.nextToken());
				dist[s][e] = -t;
			}
			for(int k = 0; k < n; k++) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
			boolean flag = false;
			for(int i = 0; i < n; i++) flag |= dist[i][i] < 0;
			System.out.println(flag ? "YES" : "NO");
		}
	}
}