package baekjoon_DP;

import java.util.*;
public class baekjoon_9184 {
	static int[][][] memo = new int[51][51][51];
	static int func(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		if(memo[a][b][c] != 987654321) return memo[a][b][c];
		if(a > 20 || b > 20 || c > 20) return func(20, 20, 20);
		if(a < b && b < c) {
			return memo[a][b][c] 
				= (func(a, b, c - 1)
				+ func(a, b - 1, c - 1)
				- func(a, b - 1, c));
		}
		return memo[a][b][c]
			= (func(a - 1, b, c)
			+ func(a - 1, b - 1, c)
			+ func(a - 1, b, c - 1)
			- func(a - 1, b - 1, c - 1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int[][] A : memo) {
			for(int[] B : A) {
				Arrays.fill(B, 987654321);
			}
		}
		StringBuffer sb = new StringBuffer();
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a == -1 && b == -1 && c == -1) break;
			sb.append(String.format("w(%d, %d, %d) = %d", a, b, c, func(a, b, c)) + "\n");
		}
		System.out.print(sb);
	}
}
