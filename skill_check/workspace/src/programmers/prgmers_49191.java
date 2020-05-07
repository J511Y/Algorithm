package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/49191?language=java
// 순위
/*
 * 문제 풀기 전 생각 2020.05.07 22:28
 * -----------------------------
 * 인접행렬 만들어놓고 하나하나 기록을 확인하면 될듯
 * 말로 설명하자니 길어질것 같아서 일단 코드 짜러감
 */
public class prgmers_49191 {
	static void Print(int[][] arr) {
		for(int[] a : arr) System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("=================");
		System.out.println();
	}
	static public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] map = new int[n][n];
        for(int[] rst : results) {
        	int a = rst[0] - 1, b = rst[1] - 1;
        	map[a][b] = 1;
        	map[b][a] = -1;
        }
        Print(map);
        
        for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				if(i == k) continue;
				for(int j = 0; j < n; j++) {
					if(i == j || j == k) continue;
					if(map[i][k] == map[k][j] && map[i][k] != 0) {						
						map[i][j] = map[i][k];
						Print(map);
					}
				}
			}
		}
        
        for(int i = 0; i < n; i++) {
        	int cnt = 0;
        	for(int j = 0; j < n; j++) {
        		if(i == j) continue;
        		if(map[i][j] != 0) cnt++;
        	}
        	if(cnt == n - 1) answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(5, new int[][] {{4,3}, {4,2}, {3,2}, {1,2}, {2,5}}));
	}
}
