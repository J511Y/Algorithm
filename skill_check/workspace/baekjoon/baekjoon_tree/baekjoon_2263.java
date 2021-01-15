package baekjoon_tree;

import java.util.*;
public class baekjoon_2263 {
	static int n;
	static int[] in, post, idx;
	static void pre(int is, int ie, int ps, int pe) {
		if (is > ie || ps > pe) return;
		System.out.print((post[pe] + 1) + " ");
		int ridx = idx[post[pe]];
		pre(is, ridx - 1, ps, ps + ridx - is - 1);
		pre(ridx + 1, ie, ps + ridx - is,pe - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		in = new int[n];
		post = new int[n];
		idx = new int[n];
		for(int i = 0; i < n; i++) in[i] = sc.nextInt() - 1;
		for(int i = 0; i < n; i++) post[i] = sc.nextInt() - 1;
		for(int i = 0; i < n; i++) idx[in[i]] = i;
		pre(0, n - 1, 0, n - 1);
	}
}
