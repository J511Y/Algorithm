package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42895
// N으로 표현
import java.util.*;
public class prgmers_42895 {
	static List<Integer> list = new ArrayList<>();
    public int solution(int N, int number) {
        int n = N;
        boolean[][] DP = new boolean[9][32001];
        //초기값 세팅
        for(int i = 1; i < 9; i++){
            if(n > 32000) break;
            DP[i][n] = true;
            list.add(n);
            n = Integer.parseInt(n + (N + ""));
        }
        int size = list.size();
        for(int i = 1; i < 8; i++){
            for(int j = 0; j < 32001; j++){
                // 만들어지지 않은 값인 경우
                if(DP[i][j] == false) continue;
                for(int k = 0; k < size; k++){
                    if(i + k + 1 == 9) break;
                    
                    int M = list.get(k);
                    
                    if(j + M < 32001) DP[i+k+1][j+M] = true;
                    if(0 <= j - M) DP[i+k+1][j-M] = true;
                    if(0 <= M - j) DP[i+k+1][M-j] = true;
                    if(j * M < 32001) DP[i+k+1][j*M] = true;
                    if(0 <= j / M) DP[i+k+1][j/M] = true;
                    if(j != 0 && 0 <= M / j) DP[i+k+1][M/j] = true;
                }
            }
        }
        for(int i = 1; i < 9; i++){
            if(DP[i][number]) return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
