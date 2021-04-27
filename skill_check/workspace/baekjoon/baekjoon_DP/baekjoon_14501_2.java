package baekjoon_DP;

import java.util.*;
public class baekjoon_14501_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] 시간 = new int[n], 금액 = new int[n], 최종금액 = new int[n+1];
		for(int i = 0; i < n * 2; i++) (i % 2 == 0 ? 시간 : 금액)[i / 2] = sc.nextInt();
		for(int 당일 = 0; 당일 < n; 당일++) {
			//dp[i] = i일까지 일했을 때 번 돈
			// i일에 일을 하는 경우
			int 종료일 = 당일 + 시간[당일];
			if(종료일 < n + 1) {
				최종금액[종료일] = Math.max(최종금액[당일] + 금액[당일], 최종금액[종료일]);
			}
			// i일에 일을 안하는 경우
			int 다음날 = 당일 + 1;
			최종금액[다음날] = Math.max(최종금액[당일], 최종금액[다음날]);
		}
		System.out.println(최종금액[n]);
	}
}
