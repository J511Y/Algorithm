import java.util.*;
class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int INF = 1 << 25, answer = INF;
        int[][] dist = new int[n + 1][n + 1];
        for(int i = 0; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        for(int[] fare : fares) {
            int x = fare[0], y = fare[1] , d = fare[2];
            dist[x][y] = dist[y][x] = d;
        }
        
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        for(int i = 1; i <= n; i++) answer = Math.min(answer, dist[s][i] + dist[i][a] + dist[i][b]);
        return answer;
    }
}