package baekjoon_백트래킹;

import java.util.*;
public class baekjoon_15684 {
	static int n, m, h, rst = 4;
	static int[][] map = new int[33][33];
	static boolean check() {
		System.out.println("====================");
		for(int[] m : map) System.out.println(Arrays.toString(m));
		for(int i = 1; i <= h; i++) {
			int tmp = i;
			for(int j = 1; j <= n; j++) {
				if(map[i][j] == 1) tmp++;
				else if (map[i][j-1] == 1) tmp--;
			}
			if(tmp != i) return false;
		}
		return true;
	}
	static void dfs(int cnt, int i, int j) {
		if(cnt >= rst) return;
		if(check()) {
			rst = Math.min(rst, cnt);
			return;
		}
		for(int r = 1; i <= n; i++, r++) {
			for(int c = r == 1 ? j : 1; c < h; c++) {
				if(map[i][c] == 0 && map[i][c+1] == 0) {
					map[i][c] = 1;
					dfs(cnt + 1, i, j + 1);
					map[i][c] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		h = sc.nextInt();
		for(int i = 0; i < m; i++) map[sc.nextInt()][sc.nextInt()] = 1;
		dfs(0, 1, 1);
		System.out.println(rst == 4 ? -1 : rst);
	}
}
