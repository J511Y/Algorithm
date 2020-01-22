package baekjoon_DFSBFS;
import java.util.*;
public class baekjoon_7576 {
	static int[][] WH = new int[][] {{0, 1, 0, -1}, {1, 0, -1, 0}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), max = 0, cnt = 0;
		boolean already = true;
		int[][] tomato = new int[n][m];
		Queue<int[]> q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int x = sc.nextInt();
				tomato[i][j] = x;
				if(x == 0) {
					cnt++;
					already = false;
				}else if (x == 1) {
					q.add(new int[] {i, j, 0});
				}
			}
		}
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			max = Math.max(max, arr[2]);
			for(int i = 0; i < 4; i++) {
				int x = arr[0] + WH[0][i];
				int y = arr[1] + WH[1][i];
				if(0 <= x && 0 <= y && x < n && y < m) {
					if(tomato[x][y] == 0) {
						q.add(new int[] {x, y, arr[2] + 1});
						tomato[x][y] = 1;
						cnt--;
					}
				}
			}
		}
		System.out.println(cnt == 0 ? max : -1);
	}
}
