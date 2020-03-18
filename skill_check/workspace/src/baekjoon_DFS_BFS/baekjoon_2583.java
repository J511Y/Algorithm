package baekjoon_DFS_BFS;
import java.util.*;
public class baekjoon_2583 {
	static List<Integer> list = new ArrayList<>();
	static int[][] wh = new int [][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int cnt = 0, n, m;
	static void dfs(boolean[][] map, int i, int j) {
		map[i][j] = true; cnt++;
		for(int x = 0; x < 4; x++) {
			int ii = i + wh[0][x], jj = j + wh[1][x];
			if(0 <= ii && ii < m && 0 <= jj && jj < n && !map[ii][jj]) dfs(map, ii, jj);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); n = sc.nextInt(); int k = sc.nextInt();
		boolean[][] map = new boolean[m][n];
		for(int i=0; i<k; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int c = sc.nextInt(), d = sc.nextInt();
			for(; a < c; a++) {
				for(int bb = b; bb < d; bb++) {
					map[bb][a] = true;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(!map[i][j]) {
					dfs(map, i, j);
					list.add(cnt); cnt = 0;
				}
			}
		}
		list.sort(null);
		System.out.println(list.size());
		for(int i : list) System.out.print(i+" ");
	}
}
