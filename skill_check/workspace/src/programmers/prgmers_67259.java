package programmers;

import java.util.*;
public class prgmers_67259 {

	int answer = 1 << 30, n;
	int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}}, dp;
	boolean[][] vst;
	void DFS(int[][] board, int x, int y, int h, int cost) {
		// h = 0 오른쪽, 1, 아래, 2 = 왼쪽, 3 = 위
        dp[x][y] = Math.min(dp[x][y], cost);
		if(x == n - 1 && y == n - 1) answer = Math.min(answer, cost);
		else {
			for(int i = 0; i < 4; i++) {
				int X = x + wh[0][i];
				int Y = y + wh[1][i];
				if(0 <= X && 0 <= Y && X < n && Y < n && vst[X][Y] == false && board[X][Y] == 0) {
					int road = (h == -1 || h == i) ? 100 : 600;
                    if (cost + road > answer || cost + road > dp[X][Y]) continue;
					vst[X][Y] = true;
					DFS(board, X, Y, i, cost + road);
					vst[X][Y] = false;
				}
			}
		}
	}
	public int solution(int[][] board) {
		n = board.length;
		vst = new boolean[n][n];
		vst[0][0] = true;
        dp = new int[n][n];
        for(int i = 0; i < n * n; i++) dp[i/n][i%n] = 1 << 30;
        DFS(board, 0, 0, -1, 0);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
