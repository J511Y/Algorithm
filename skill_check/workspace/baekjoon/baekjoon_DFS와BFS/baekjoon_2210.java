package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_2210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5], wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < 25; i++) arr[i/5][i%5] = sc.nextInt();
		for(int i = 0; i < 25; i++) {
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {i / 5, i % 5, arr[i/5][i%5], 1});
			while(!q.isEmpty()) {
				int[] p = q.poll();
				int x = p[0], y = p[1], v = p[2], c = p[3];
				if(c == 6) {
					set.add(v);
					continue;
				}
				for(int j = 0; j < 4; j++) {
					int a = x + wh[0][j], b = y + wh[1][j];
					if(0 <= a && 0 <= b && a < 5 && b < 5) {
						q.add(new int[] {a, b, v * 10 + arr[a][b], c + 1});
					}
				}
			}
		}
		System.out.print(set.size());
	}
}
