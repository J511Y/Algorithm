package baekjoon_math2;
// https://www.acmicpc.net/problem/18373
// N!!!...! mod P

import java.util.*;
public class baekjoon_18373 {
	static long fact(long i, int p) {
		if(i < 2) return 1;
		return (i * fact(i - 1, p)) % p;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt();
		long l = n;
		for(int i = 0; i < k; i++) {
			l = fact(l, p);
			System.out.println(l);
		}
		System.out.println(l % p);
	}
}
