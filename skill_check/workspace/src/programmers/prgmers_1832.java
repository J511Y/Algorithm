package programmers;

import java.util.*;

public class prgmers_1832 {
	static int[][] WH = new int[][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static boolean isRange(int a, int b, int c, int d) {
		return 0 <= a && 0 <= b && a < c && b < d;
	}
	static public int solution(int n, int m, int[][] cityMap) {
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		if(cityMap[i][j] == 1) dp[i][j] = -1;
        	}
        }
        
        // 탑다운 식으로 진행
        Queue<int[]> q = new LinkedList<>();
        dp[n-1][m-1] = 1;
        q.add(new int[] {n-1, m-1, 0});
        while(!q.isEmpty()) {
        	int[] poll = q.poll();
        	int x = poll[0], y = poll[1], d = poll[2];
        	for(int i = 0; i < 4; i++) {
        		if(cityMap[x][y] == 2 && d != i) continue;
        		int X = x + WH[0][i];
            	int Y = y + WH[1][i];
            	// 웅덩이 아니면 넣어줌
            	if(isRange(X, Y, n, m) && dp[X][Y] == 0) {
            		int sum = 0;
            		for(int j = 0; j < 4; j++) {
            			int a = X + WH[0][j];
            			int b = Y + WH[1][j];
            			if(isRange(a, b, n, m) && dp[a][b] > 0) {
            				sum += dp[a][b] % 20170805;
            				sum %= 20170805;
            			}
            		}
            		dp[X][Y] = sum;
            		q.add(new int[] {X, Y, i});
            	}
        	}
        }
        for(int[] d : dp) {
        	System.out.println(Arrays.toString(d));
        }
        return dp[0][0];
    }
	public static void main(String[] args) {
		System.out.println(solution(3, 6, new int[][] {{0, 2, 0, 0, 0, 2}, {0, 0, 2, 0, 1, 0}, {1, 0, 0, 2, 2, 0}}));

	}

}
