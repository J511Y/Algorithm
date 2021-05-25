package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_21772 {
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static int r, c, t, rst = 0;
	static char[][] arr;
	static void dfs(int x, int y, int time, int cnt) {
		if(time == t) {
			rst = Math.max(cnt, rst);
			return;
		}
		for(int i = 0; i < 4; i++) {
			int a = x + wh[0][i], b = y + wh[1][i];
			if(0 <= a && a < r && 0 <= b && b < c && arr[a][b] != '#') {
				boolean k = arr[a][b] == 'S';
				arr[a][b] = '.';
				dfs(a, b, time + 1, cnt + (k ? 1 : 0));
				arr[a][b] = k ? 'S' : '.';
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		t = sc.nextInt();
		arr = new char[r][c];
		int x = 0, y = 0;
		for(int i = 0; i < r; i++) {
			arr[i] = sc.next().toCharArray();
			for(int j = 0; j < c; j++) {
				if(arr[i][j] == 'G') {
					x = i;
					y = j;
				}
			}
		}
		dfs(x, y, 0, 0);
		System.out.print(rst);
	}
}
