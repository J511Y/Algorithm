package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_17070 {
	static int n, cnt = 0;
	static int[][] map, wh = {{0, 1, 1}, {1, 0, 1}};
	static void dfs(int x, int y, int r) {
		if(x == n - 1 && y == n - 1) cnt++;
		else {
			for(int i = 0; i < 3; i++) {
				if((r == 0 && i == 1) || (r == 1 && i == 0)) continue;
				int a = x + wh[0][i], b = y + wh[1][i];
				if(0 <= a && 0 <= b && a < n && b < n && map[a][b] == 0) {
					if(i == 2) {
						if(map[a-1][b] == 0 && map[a][b-1] == 0) {
							map[a][b] = map[a-1][b] = map[a][b-1] = 1;
							dfs(a, b, i);
							map[a][b] = map[a-1][b] = map[a][b-1] = 0;							
						}
					} else {
						map[a][b] = 1;
						dfs(a, b, i);
						map[a][b] = 0;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i = 0; i < n * n; i++) map[i/n][i%n] = sc.nextInt();
		map[0][0] = map[0][1] = 1;
		dfs(0, 1, 0);
		System.out.print(cnt);
	}
}
