import java.util.*;
class Main {
	static int n, m, cnt, round;
	static int[][] map, wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static void dfs(int x, int y) {
		map[x][y] = 2;
		for(int i = 0; i < 4; i++) {
			int a = x + wh[0][i], b = y + wh[1][i];
			if (0 <= a && 0 <= b && a < n && b < m && map[a][b] == 0) dfs(a, b);
		}
	}
	static int melt(int x, int y) {
		int contact = 0;
		for(int i = 0; i < 4; i++) {
			int a = x + wh[0][i], b = y + wh[1][i];
			if (0 <= a && 0 <= b && a < n && b < m && map[a][b] == 2) contact++;
		}
		cnt -= contact >= 2 ? 1 : 0;
		return contact >= 2 ? 0 : 1;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		map = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				cnt += map[i][j] = sc.nextInt();
			}
		}
		while(cnt > 0 && ++round > 0) {
			dfs(0, 0);
			int[][] tmp = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(map[i][j] == 1) tmp[i][j] = melt(i, j);
				}
			}
			map = tmp;
		}
		System.out.print(round);
	}
}