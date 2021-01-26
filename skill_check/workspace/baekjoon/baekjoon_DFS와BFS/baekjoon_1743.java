package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_1743 {
	static int r, c, q, cnt, max = 0;
	static int[][] map, wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static void dfs(int x, int y) {
		map[x][y] = 0;
		cnt++;
		for(int i = 0; i < 4; i++) {
			int a = x + wh[0][i], b = y + wh[1][i];
			if(0 <= a && 0 <= b && a < r && b < c && map[a][b] == 1) dfs(a, b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); c = sc.nextInt(); q = sc.nextInt();
		map = new int[r][c];
		for(int i = 0; i < q; i++) map[sc.nextInt()-1][sc.nextInt()-1] = 1;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(map[i][j] == 1) {
					cnt = 0;
					dfs(i, j);
					max = Math.max(max, cnt);
				}
			}
		}
		System.out.print(max);
	}
}
