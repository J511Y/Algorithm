package baekjoon_DFS��BFS;

import java.util.*;
public class baekjoon_14497 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int a = sc.nextInt() - 1, b = sc.nextInt() - 1, c = sc.nextInt() - 1, d = sc.nextInt() - 1;
		char[][] arr = new char[n][m];
		int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}}, rst = new int[n][m];
		for(int i = 0; i < n; i++) arr[i] = sc.next().toCharArray();
		Queue<int[]> ť = new LinkedList<>();
		ť.add(new int[] {a, b, 0});
		for(int[] ar : rst) Arrays.fill(ar, 1 << 30);
		rst[a][b] = 0;
		while(!ť.isEmpty()) {
			int[] p = ť.poll();
			int x = p[0], y = p[1], dis = p[2];
			for(int i = 0; i < 4; i++) {
				int nx = x + wh[0][i], ny = y + wh[1][i];
				if(0 <= nx && 0 <= ny && nx < n && ny < m) {
					int ���� = dis + (arr[nx][ny] != '0' ? 1 : 0);
					if(rst[nx][ny] > ����) {
						ť.add(new int[] {nx, ny, ����});
						rst[nx][ny] = ����;
					}
				}
			}
		}
		System.out.print(rst[c][d]);
	}
}
