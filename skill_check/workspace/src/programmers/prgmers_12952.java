package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12952
// N-Queen
public class prgmers_12952 {
	static int answer = 0, N;
	static boolean[][] chess;
	static void nqueen(int x) {
		if(x == N) answer++;
		else {
			for(int i = 0; i < N; i++) {
				if(isPossible(x, i)) {
					chess[x][i] = true;
					nqueen(x + 1);
					chess[x][i] = false;
				}
			}
		}
	}
	static boolean isPossible(int a, int b) {
		for(int i = 1; i <= a; i++) {
			if(isRange(a - i, b) && chess[a-i][b]) return false;
			if(isRange(a - i, b - i) && chess[a-i][b-i]) return false;
			if(isRange(a - i, b + i) && chess[a-i][b+i]) return false;
		}
		return true;
	}
	static boolean isRange(int a, int b) {
		return 0 <= a && 0 <= b && a < N && b < N;
	}
	static public int solution(int n) {
        chess = new boolean[n][n];
        N = n;
        nqueen(0);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(4));
	}
}
