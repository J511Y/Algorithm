package baekjoon_brute_force;
// https://www.acmicpc.net/problem/1124
// 언더프라임
/*
 * 문제 풀기 전 생각 2020.03.03 21:37
 * ----------------------------
 * 브루트포스 문제인듯
 */
import java.util.*;
public class baekjoon_1124 {
	static boolean[] prime = new boolean[100001];
	static int cnt = 0;
	static int Index(int x) {
		for(int i = x + 1; i < 100001; i++) {
			if(prime[i]) return i;
		}
		return -1;
	}
	static boolean isPrime(int x) {
		for(int i = 2; i < (int)Math.sqrt(x) + 1; i++) {
			if(x % i == 0) return false;
		}
		return true;
	}
	static{
		for(int i = 2; i < 100000; i++) {
			if(isPrime(i)) prime[i] = true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), cnt = 0, sosu;
		for(; a <= b; a++) {
			sosu = 0;
			int i = a, idx = 2;
			while(i > 1) {
				while(i % idx != 0) {
					idx = Index(idx);
				}
				i /= idx;
				sosu++;
			}
			if(prime[sosu]) cnt++;
		}
		System.out.println(cnt);
	}
}
