package baekjoon_DFS_BFS;
// https://www.acmicpc.net/problem/2573
// ºù»ê
import java.util.*;
public class baekjoon_2573 {
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int[][] BFS(int[][] map, int x, int y){
		int n = map.length, m = map[0].length;
		map[x][y] = 0;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			x = poll[0];
			y = poll[1];
			for(int i = 0; i < 4; i++) {
				int X = x + WH[0][i];
				int Y = y + WH[1][i];
				if(0 <= X && X < n && 0 <= Y && Y < m && map[X][Y] > 0) {
					q.add(new int[] {X, Y});
					map[X][Y] = 0;
				}
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] map = new int[n][m];
		for(int i = 0; i < n * m; i++) map[i/m][i%m] = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			int j = 0;
			int[][] minus = new int[n][m];
			for(; j < n * m && i > 0; j++) {
				int x = j/m, y = j%m;
				for(int k = 0; k < 4; k++) {
					int X = x + WH[0][k];
					int Y = y + WH[1][k];
					if(0 <= X && X < n && 0 <= Y && Y < m && map[X][Y] < 1) {
						minus[x][y]++;				
					}
				}
			}
			for(j = 0; j < n * m; j++) map[j/m][j%m] -= minus[j/m][j%m];
			System.out.println();
			for(int[] arr : map) {
				System.out.println(Arrays.toString(arr));
			}
			int[][] clone = new int[n][m];
			for(j = 0; j < n * m; j++) clone[j/m][j%m] = map[j/m][j%m];
			for(j = 0; j < n * m; j++) {
				if(clone[j/m][j%m] > 0) {
					clone = BFS(clone, j/m, j%m);
					break;
				}
			}
			System.out.println();
			for(int[] arr : clone) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("================");
			for(; j < n * m; j++) {
				if(clone[j/m][j%m] > 0) {
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println(0);
	}
}
