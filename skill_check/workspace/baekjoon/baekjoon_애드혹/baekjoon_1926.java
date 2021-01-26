package baekjoon_æ÷µÂ»§;
import java.util.*;
public class baekjoon_1926 {
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0, max = 0;
		int[][] map = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 1) {
					cnt++;
					int tmp = 0;
					Queue<int[]> q = new LinkedList<>();
					q.add(new int[] {i, j});
					map[i][j] = 0;
					while(!q.isEmpty()) {
						int[] p = q.poll();
						int x = p[0], y = p[1];
						tmp++;
						for(int k = 0; k < 4; k++) {
							int a = x + wh[0][k], b = y + wh[1][k];
							if(0 <= a && 0 <= b && a < n && b < m && map[a][b] == 1) {
								map[a][b] = 0;
								q.add(new int[] {a, b});
							}
						}
					}
					max = Math.max(max, tmp);
				}
			}
		}
		System.out.print(cnt + "\n" + max);
	}
}
