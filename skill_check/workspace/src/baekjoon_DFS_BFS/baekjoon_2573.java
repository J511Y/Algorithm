package baekjoon_DFS_BFS;
// https://www.acmicpc.net/problem/2573
// ºù»ê
import java.util.*;
public class baekjoon_2573 {
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int count(int[][] map){
		int n = map.length, m = map[0].length, cnt = 0;
		int[][] vst = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] != 0 && vst[i][j] == 0) {
					cnt++;
					vst[i][j] = 1;
					Queue<int[]> q = new LinkedList<>();
					q.add(new int[] {i, j});
					while(!q.isEmpty()) {
						int[] poll = q.poll();
						int a = poll[0], b = poll[1];
						for(int k = 0; k < 4; k++) {
							int x = a + WH[0][k];
							int y = b + WH[1][k];
							if(0 <= x && x < n && 0 <= y && y < m && map[x][y] > 0 && vst[x][y] == 0) {
								q.add(new int[] {x, y});
								vst[x][y] = 1;
							}
						}
					}
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), year = 0;
		int[][] map = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		while(count(map) == 1) {
			year++;
			int[][] tmp = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					int cnt = 0;
					for(int k = 0; k < 4; k++) {
						int a = i + WH[0][k];
						int b = j + WH[1][k];
						if(0 <= a && 0 <= b && a < n && b < m && map[a][b] == 0) cnt++;
					}
					tmp[i][j] = Math.max(0, map[i][j] - cnt);
				}
			}
			
			map = tmp;
		}
		int sum = 0;
		for(int[] arr : map) for(int i : arr) sum += i;
		if(sum == 0) year = 0;
		System.out.println(year);
	}
}
