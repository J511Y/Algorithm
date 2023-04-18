import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), rst = -1;
		int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
		int[][][] vst = new int[n][m][2];
		char[][] map = new char[n][];
		for(int i = 0; i < n; i++) map[i] = sc.next().toCharArray();
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0, 0, 1});
		vst[0][0][0] = vst[0][0][1] = 1;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int a = p[0], b = p[1], f = p[2], c = p[3];
			if (a == n - 1 && b == m - 1) {
				rst = c;
				break;
			}
			for(int i = 0; i < 4; i++) {
				int x = a + wh[0][i], y = b + wh[1][i];
				if (0 <= x && 0 <= y && x < n && y < m) {
					if (map[x][y] == '0' && vst[x][y][f] == 0) {
						q.add(new int[] {x, y, f, c + 1});
						vst[x][y][f] = c;
					}
					if (map[x][y] == '1' && f == 0 && vst[x][y][f + 1] == 0) {
						q.add(new int[] {x, y, f + 1, c + 1});
						vst[x][y][f + 1] = c;
					}
				}
			}
		}
		System.out.print(rst);
	}
}