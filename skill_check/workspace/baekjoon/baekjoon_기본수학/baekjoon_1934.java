package baekjoon_기본수학;
// https://www.acmicpc.net/problem/1934
// 최소 공배수
/*
 * 문제
두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 
이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

출력
첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 */

/*
 * 문제 풀기 전 생각 2020.02.22 22:00
 * --------------------------
 * 두 수를 곱하고 최대공약수로 나눈 몫을 출력하면 되지 않을까 생각.
 * 
 * 문제 풀고 난 후 생각 2020.02.22 22:02
 * --------------------------
 * ㅇㅇ 맞았음.
 */
import java.util.*;
public class baekjoon_1934 {
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = gcd(a, b);
			System.out.println((a * b) / gcd);
		}
	}
}
