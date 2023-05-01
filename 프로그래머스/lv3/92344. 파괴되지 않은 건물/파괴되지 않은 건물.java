import java.util.*;
class Solution {
    public int solution(int[][] board, int[][] skill) {
        int n = board.length, m = board[0].length, cnt = 0;
        int[][] sum = new int[n + 1][m + 1];
        for(int[] sk : skill) {
            int type = sk[0], r1 = sk[1], c1 = sk[2], r2 = sk[3] + 1, c2 = sk[4] + 1, degree = sk[5];
            if (type == 1) degree *= -1;
            sum[r1][c1] += degree;
            sum[r1][c2] += -degree;
            sum[r2][c1] += -degree;
            sum[r2][c2] += degree;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < m; j++) {
                sum[i][j] += sum[i][j-1];
            }
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sum[i][j] += sum[i-1][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] += sum[i][j];
                if (board[i][j] > 0) cnt++;
            }
        }
        return cnt;
    }
}