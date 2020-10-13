package baekjoon_dijkstra;

import java.util.*;
public class baekjoon_20046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), MAX = Integer.MAX_VALUE;
		int[][] map = new int[n][m], dp = new int[n][m], wh = {{1, 0, -1, 0}, {0, 1, 0, -1}};
		boolean[][] vst = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int x = sc.nextInt();
				if(x != 0) dp[i][j] = MAX;
				map[i][j] = x;
			}
		}
		PriorityQueue<Node> pq = new PriorityQueue<Node>((a, b)->{
			return a.dis - b.dis;
		});
		if(map[0][0] != -1) {
			pq.add(new Node(0, 0, map[0][0]));
			vst[0][0] = true;
			dp[0][0] = map[0][0];
		}
		dp[n-1][m-1] = -1;
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int x = node.x, y = node.y, dis = node.dis;
			for(int i = 0; i < 4; i++) {
				int X = x + wh[0][i];
				int Y = y + wh[1][i];
				if(0 <= X && 0 <= Y && X < n && Y < m && vst[X][Y] == false && map[X][Y] != -1) {
					pq.add(new Node(X, Y, dis + map[X][Y]));
					vst[X][Y] = true;
					dp[X][Y] = dis + map[X][Y];
				}
			}
		}
		for(int[] d : dp) System.out.println(Arrays.toString(d));
		System.out.println("---------------------");
		System.out.println(dp[n-1][m-1]);
	}
}
class Node{
	int x, y, dis;
	Node(int x, int y, int dis){
		this.x = x;
		this.y = y;
		this.dis = dis;
	}
}