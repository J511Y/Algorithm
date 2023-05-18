import java.util.*;
public class Main {
	static int n;
	static int[][] cost;
	static int bfs(int s, int e) {
		int[] vst = new int[n+1];
		Arrays.fill(vst, 1 << 30);
		vst[s] = 0;
		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		q.add(new int[] {s, 0});
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int m = p[0], v = p[1];
			if(m == e) return v;
			for(int i = 1; i <= n; i++) {
				int nval = v + cost[m][i];
				if(cost[m][i] != -1 && vst[i] > nval) {
					vst[i] = nval;
					q.add(new int[] {i, nval});
				}
			}
		}
		return n * -100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int e = sc.nextInt();
		cost = new int[n+1][n+1];
		for(int[] c : cost) Arrays.fill(c, -1);
		for(int i = 0; i < e; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			cost[a][b] = cost[b][a] = Math.min(c, cost[b][a] == -1 ? 1 << 30 : cost[b][a]);
		}
		int a = sc.nextInt(), b = sc.nextInt(), rst = 1 << 30;
		int ab = bfs(1, a) + bfs(a, b) + bfs(b, n);
		int ba = bfs(1, b) + bfs(b, a) + bfs(a, n);
		if(ab > 0) rst = Math.min(rst, ab);
		if(ba > 0) rst = Math.min(rst, ba);
		System.out.print(rst == 1 << 30 ? -1 : rst);
	}
}