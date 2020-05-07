package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42898
// ���
/*
 * ���� Ǯ�� �� ���� 2020.05.07 23:13
 * ----------------------------
 * ž-�ٿ� ������ DP �����ϰų�
 * BFS�� �����ص� �ɵ�
 */
import java.util.*;
public class prgmers_42898 {
	static int[][] WH = new int[][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static boolean isRange(int a, int b, int c, int d) {
		return 0 <= a && 0 <= b && a < c && b < d;
	}
	static public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        // ������ ����
        for(int[] pud : puddles) dp[pud[1] - 1][pud[0] - 1] = -1;
        
        // ž�ٿ� ������ ����
        Queue<int[]> q = new LinkedList<>();
        dp[n-1][m-1] = 1;
        q.add(new int[] {n-1, m-1});
        while(!q.isEmpty()) {
        	int[] poll = q.poll();
        	int x = poll[0], y = poll[1];
//        	System.out.println(x + ", " + y + ", " + dp[x][y]);
        	for(int i = 0; i < 4; i++) {
        		int X = x + WH[0][i];
            	int Y = y + WH[1][i];
            	// ������ �ƴϸ� �־���
            	if(isRange(X, Y, n, m) && dp[X][Y] == 0) {
            		int sum = 0;
            		for(int j = 0; j < 4; j++) {
            			int a = X + WH[0][j];
            			int b = Y + WH[1][j];
            			if(isRange(a, b, n, m) && dp[a][b] > 0) {
            				sum += dp[a][b] % 1000000007;
            				sum %= 1000000007;
            			}
            		}
            		dp[X][Y] = sum;
            		q.add(new int[] {X, Y});
//			        for(int[] d : dp) System.out.println(Arrays.toString(d));
//			        System.out.println("================\n\n");
            	}
        	}
        }
        return dp[0][0];
    }
	public static void main(String[] args) {
		System.out.println(solution(4, 3, new int[][] {{2, 2}}));
//		System.out.println(solution(50, 50, new int[][] {{2, 2}}));
	}
}
