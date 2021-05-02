package baekjoon_ДЉРћЧе;

import java.util.*;
public class baekjoon_11660 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] sum = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int k = sc.nextInt();
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + k;
			}
		}
		while(m-->0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			System.out.println(sum[c][d] - sum[c][b-1] - sum[a-1][d] + sum[a-1][b-1]);
		}
	}
}
