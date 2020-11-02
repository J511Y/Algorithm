package baekjoon_DFS_BFS;
import java.util.*;
public class baekjoon_14620 {
	static int rst = 1 << 30, n;
	static int[][] map, vst;
	static void DFS(int a, int b, int sum, int cnt) {
		if(cnt == 3) {
			rst = Math.min(rst, sum);
			return;
		}
		for(int i = a; i < n - 1; i++) {
			for(int j = i == a ? b : 1; j < n - 1; j++) {
				if(vst[i][j] == 0 && vst[i+1][j] == 0 && vst[i][j+1] == 0 && vst[i-1][j] == 0 && vst[i][j-1] == 0) {
					vst[i][j] = vst[i-1][j] = vst[i][j-1] = vst[i+1][j] = vst[i][j+1] = 1;
					int next = sum + map[i][j]+ map[i-1][j]+ map[i][j-1]+ map[i+1][j]+ map[i][j+1];
					DFS(i, j, next, cnt + 1);
					vst[i][j] = vst[i-1][j] = vst[i][j-1] = vst[i+1][j] = vst[i][j+1] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		vst = new int[n][n];
		for(int i = 0; i < n * n; i++) map[i/n][i%n] = sc.nextInt();
		DFS(1, 1, 0, 0);
		System.out.print(rst);
	}
}
