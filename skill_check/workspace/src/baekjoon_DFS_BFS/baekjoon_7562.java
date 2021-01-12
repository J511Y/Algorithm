import java.util.*;
class baekjoon_7562 {
	static int[][] wh = {{-2, -2, -1, -1, 1, 1, 2, 2}, {-1, 1, -2, 2, -2, 2, -1, 1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int[][] vst = new int[n][n];
			int[] s = new int[3], e = new int[3];
			for(int i = 0; i < 4; i++) (i >= 2 ? e : s)[i%2] = sc.nextInt();
			Queue<int[]> q = new LinkedList<>();
			q.add(s);
			vst[s[0]][s[1]] = 1;
			while(!q.isEmpty()) {
				int[] p = q.poll();
				int a = p[0], b = p[1], d = p[2];
				if(a == e[0] && b == e[1]) {
					System.out.println(d);
					break;
				}
				for(int i = 0; i < 8; i++) {
					int x = a + wh[0][i], y = b + wh[1][i];
					if(0 <= x && 0 <= y && x < n && y < n && vst[x][y] == 0) {
						vst[x][y] = 1;
						q.add(new int[] {x, y, d + 1});
					}
				}
			}
		}
	}
}