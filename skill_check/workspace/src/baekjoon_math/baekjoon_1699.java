package baekjoon_math;
// https://www.acmicpc.net/problem/1699
// 제곱수의 합
/*
 * 문제 풀기 전 생각 2020.03.18 23:12
 * ----------------------
 * 제곱근에 제일 가까운 수로 계속 빼보면 되지 않을까 생각
 */
public class baekjoon_1699 {
	static int min = 999;
	static void func(int n, int cnt) {
		if(cnt >= min) return;
		if(n == 0) min = Math.min(min, cnt);
		int root = (int)Math.sqrt(n) + 1;
		for(; root > 0; root--) func(n - (root * root), cnt + 1);
	}
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		func(n, 0);
		System.out.println(min);
	}
}
