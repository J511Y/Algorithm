package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_3197 {
	static int[] o, t;
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		char[][] arr = new char[n][];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next().toCharArray();
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 'L') {
					if(o == null) o = new int[] {i, j};
					else t = new int[] {i, j};
				}				
			}
		}
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		boolean[][] vst = new boolean[n][m];
		vst[o[0]][o[1]] = true;
		pq.add(new int[] {o[0], o[1], 0});
		while(!pq.isEmpty()) {
			int[] p = pq.poll();
			int a = p[0], b = p[1], c = p[2];
			
			if(a == t[0] && b == t[1]) {
				System.out.println((c + 1) / 2);
				return;
			}
			for(int i = 0; i < 4; i++) {
				int A = a + wh[0][i], B = b + wh[1][i];
				if(0 <= A && 0 <= B && A < n && B < m && !vst[A][B]) {
					vst[A][B] = true;
					pq.add(new int[] {A, B, c + (arr[A][B] == 'X' ? 1 : 0)});
				}
			}
		}
	}
}
