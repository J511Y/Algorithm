package baekjoon_recursion;
// https://www.acmicpc.net/problem/1531
// 투명

import java.util.*;
public class baekjoon_1531 {
	static int[][] map = new int[101][101];
	static int j, c, d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			// c와 d는 변경되지 않으므로 static으로 설정해줬음.
			c = sc.nextInt();
			d = sc.nextInt();
			// 재귀를 반복하면서 b(열)은 재 조정이 필요하므로 할당해줌
			j = b;
			// recursion = a, b 부터 c, d까지의 구역을 1 증가시키는 재귀함수
			recursion(a, b);
		}
		for(int[] arr : map) {
			for(int i : arr) {
				if(i > m) cnt++;
			}
		}
		System.out.print(cnt);
	}
	static void recursion(int a, int b) {
		// a가 c보다 커진다면 재귀 종료
		if(a > c) return;
		// b가 d보다 커진다면 a를 1 증가, b는 j로 재할당
		else if(b > d) recursion(a + 1, j);
		else {
			// 해당 구역 카운트 증가 및 재귀 수행
			map[a][b]++;
			recursion(a, b + 1);			
		}
	}
}
