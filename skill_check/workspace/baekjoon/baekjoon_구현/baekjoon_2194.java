package baekjoon_구현;
// https://www.acmicpc.net/problem/2194
// 유닛 이동시키기
import java.util.*;
public class baekjoon_2194 {
	static int n, m, a, b, k;
	static boolean[][] map, vst;
	static int[] goal = new int[2];
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static boolean isRange(int x, int y) {
		for(int i = x; i < x + a; i++) {
			for(int j = y; j < y + b; j++) {
				if(i < 0 || j < 0 || i >= n || j >= m || map[i][j]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<int[]> q = new LinkedList<>();
		n = sc.nextInt(); m = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt(); k = sc.nextInt();
		map = new boolean[n][m]; vst = new boolean[n][m];
		for(int i = 0; i < k; i++) map[sc.nextInt() - 1][sc.nextInt() - 1] = true;
		q.add(new int[] {sc.nextInt() - 1, sc.nextInt() - 1, 0});
		vst[q.peek()[0]][q.peek()[1]] = true;
		goal[0] = sc.nextInt() - 1; goal[1] = sc.nextInt() - 1;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			for(int i = 0; i < 4; i++) {
				int X = x + WH[0][i];
				int Y = y + WH[1][i];
				if(X == goal[0] && Y == goal[1]) {
					System.out.print(cnt + 1);
					return;
				}
				if(isRange(X, Y) && !vst[X][Y]) {
					vst[X][Y] = true;
					q.add(new int[] {X, Y, cnt + 1});
				}
			}
		}
		System.out.print(-1);
	}
}
