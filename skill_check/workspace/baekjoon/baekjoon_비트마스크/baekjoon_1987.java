package baekjoon_비트마스크;
// https://www.acmicpc.net/problem/1987
// 알파벳
import java.util.*;
class baekjoon_1987{
	static int maxcnt = 0, n, m;
	static byte[][] board;
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static void DFS(int a, int b, int vst, int cnt){
		maxcnt = Math.max(maxcnt, cnt);
		for(int i = 0; i < 4; i++){
			int x = a + WH[0][i];
			int y = b + WH[1][i];
			if(0 <= x && 0 <= y && x < n && y < m){
				int val = 1 << (board[x][y] - 'A');
				if((vst & val) == 0){
					DFS(x, y, vst | val, cnt + 1);
				}
			}
		}
	}
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		board = new byte[n][];
		for(int i = 0; i < n; i++) board[i] = sc.next().getBytes();
		DFS(0, 0, 1 << (board[0][0] - 'A'), 1);
		System.out.print(maxcnt);
	}
}