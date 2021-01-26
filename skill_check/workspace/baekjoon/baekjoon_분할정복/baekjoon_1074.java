package baekjoon_분할정복;

import java.util.*;
public class baekjoon_1074 {
	static int n, r, c;
	static boolean isRange(int rs, int re, int cs, int ce) {
		return rs <= r && r < re && cs <= c && c < ce;
	}
	static void func(int m, int rs, int re, int cs, int ce, int v) {
		if(m == 0) {
			System.out.println(v);
		} else {
			int rm = (re + rs) / 2, cm = (ce + cs) / 2, k = m - 1, sep = (int)Math.pow(2, k);
			sep *= sep;
			int a = v + sep, b = v + sep * 2, c = v + sep * 3;
			if(isRange(rs, rm, cs, cm)) func(k, rs, rm, cs, cm, v);
			if(isRange(rs, rm, cm, ce)) func(k, rs, rm, cm, ce, a);
			if(isRange(rm, re, cs, cm)) func(k, rm, re, cs, cm, b);
			if(isRange(rm, re, cm, ce)) func(k, rm, re, cm, ce, c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); r = sc.nextInt(); c = sc.nextInt();
		int l = (int)Math.pow(2, n);
		func(n, 0, l, 0, l, 0);
	}
}
