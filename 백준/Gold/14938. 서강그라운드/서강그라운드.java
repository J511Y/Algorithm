import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), r = sc.nextInt(), INF = 1 << 25, max = 0;
		int[] items = new int[n + 1];
		int[][] dist = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) items[i] = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			Arrays.fill(dist[i], INF);
			dist[i][i] = 0;
		}
		for(int i = 0; i < r; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), l = sc.nextInt();
			dist[a][b] = dist[b][a] = Math.min(dist[a][b], l);
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			int cnt = 0;
			for(int j = 1; j <= n; j++) {
				if(dist[i][j] <= m) cnt += items[j];
			}
			max = Math.max(cnt, max);
		}
		System.out.print(max);
	}
}