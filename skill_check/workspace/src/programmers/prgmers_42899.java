package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42899
// 프로그래머스 LEVEL4 서울에서 경산까지
public class prgmers_42899 {
	public int solution(int K, int[][] travel) {
        int answer = 0, N = travel.length;
        int[][] DP = new int[N+1][K+1];
        DP[1][travel[0][0]] = travel[0][1];
        DP[1][travel[0][2]] = travel[0][3];
        for(int i = 1; i < N; i++){
            int[] tra = travel[i];
            int walktime = tra[0], walkval = tra[1];
            int biketime = tra[2], bikeval = tra[3];
            for(int j = 0; j < K; j++){
                if(DP[i][j] == 0) continue;
                if(j + walktime <= K){
                    DP[i+1][j+walktime] = Math.max(DP[i+1][j+walktime], DP[i][j] + walkval);
                }
                if(j + biketime <= K){
                    DP[i+1][j+biketime] = Math.max(DP[i+1][j+biketime], DP[i][j] + bikeval);
                }
            }
        }
        for(int i = 0; i <= K; i++) answer = Math.max(answer, DP[N][i]);
        return answer;
    }
	public static void main(String[] args) {
	}
}
