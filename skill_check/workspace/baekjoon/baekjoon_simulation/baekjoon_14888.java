package baekjoon_simulation;
// https://www.acmicpc.net/problem/14888
// 연산자 끼워넣기
// 삼성SW 기출문제였던듯

import java.util.*;
public class baekjoon_14888 {
	static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	static int[] numbers, oper = new int[4];
	static void DFS(int idx, int result) {
		// 기저 조건 설정
		if(idx == n) {
			// idx == n이라면 연산자들을 사용하여 연산을 마친 결과를 result가 갖고 있음.
			max = Math.max(max, result);
			min = Math.min(min, result);
			return;
		}
		// oper에 연산자가 남아있다면 사용해줌
		for(int i = 0; i < 4; i++) {
			if(oper[i] != 0) {
				int tmp;
				switch(i) {
					case 0: tmp = result + numbers[idx]; break; 
					case 1: tmp = result - numbers[idx]; break; 
					case 2: tmp = result * numbers[idx]; break; 
					default : tmp = result / numbers[idx]; break; 
				}
				// 사용했으므로 oper[i]--;
				oper[i]--;
				// 재귀적으로 다음 연산을 호출
				DFS(idx + 1, tmp);
				// 호출이 종료된 경우 이전 상태로 회귀
				oper[i]++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		numbers = new int[n];
		for(int i = 0; i < n; i++) numbers[i] = sc.nextInt();
		for(int i = 0; i < 4; i++) oper[i] = sc.nextInt();
		DFS(1, numbers[0]);
		System.out.println(max);
		System.out.println(min);
	}
}
