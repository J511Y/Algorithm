package kakao;
import java.util.*;
public class kakao_2020_4 {
	int INF = 1 << 25;
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 1 << 30;
        int[][] map = new int[n+1][n+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                map[i][j] = INF;
                if(i == j) map[i][j] = 0;
            }
        }
        for(int[] f : fares) {
            int i = f[0], j = f[1], k = f[2];
            map[i][j] = map[j][i] = k;
        }
        for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
        
        for(int i = 1; i <= n; i++){
            // 여기까지 합승
            if(map[i][a] == INF || map[i][b] == INF) continue;
            answer = Math.min(map[s][i] + map[i][a] + map[i][b], answer);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
