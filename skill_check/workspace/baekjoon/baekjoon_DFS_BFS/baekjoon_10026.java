package baekjoon_DFS_BFS;
// https://www.acmicpc.net/problem/10026
// 적록색약
import java.util.*;
public class baekjoon_10026 {
	static int n;
	static byte[][] map;
	static int[][] NORMAL, ABNORMAL, WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static void DFS(int a, int b, byte color, int type) {
		if(type == 0) NORMAL[a][b] = 1;
		if(type == 1) ABNORMAL[a][b] = 1;
		for(int i = 0; i < 4; i++) {
			int A = a + WH[0][i];
			int B = b + WH[1][i];
			if(0 <= A && 0 <= B && A < n && B < n) {
				if(type == 0 && NORMAL[A][B] == 0 && map[A][B] == color) DFS(A, B, color, 0);
				if(type == 1 && ABNORMAL[A][B] == 0 && (map[A][B] == color || ((color == 'R' || color == 'G') && (map[A][B] == 'R' || map[A][B] == 'G')))) DFS(A, B, color, 1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int normal = 0, abnormal = 0;
		NORMAL = new int[n][n]; ABNORMAL = new int[n][n];
		map = new byte[n][];
		for(int i = 0; i < n; i++) map[i] = sc.next().getBytes();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(NORMAL[i][j] == 0) {
					DFS(i, j, map[i][j], 0);
					normal++;
				}
				if(ABNORMAL[i][j] == 0) {
					DFS(i, j, map[i][j], 1);
					abnormal++;
				}
			}
		}
		System.out.print(normal + " " + abnormal);
	}
}
