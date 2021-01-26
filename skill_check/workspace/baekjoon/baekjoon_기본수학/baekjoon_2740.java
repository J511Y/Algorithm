package baekjoon_±âº»¼öÇÐ;
// https://www.acmicpc.net/problem/2740
// Çà·Ä °ö¼À
import java.util.*;
public class baekjoon_2740 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] A = new int[n][m], B, rst;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		n = sc.nextInt(); m = sc.nextInt();
		B = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		rst = new int[A.length][m];
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < m; j++) {
				int sum = 0;
				for(int k = 0; k < B.length; k++) {
					sum += A[i][k] * B[k][j];
				}
				rst[i][j] = sum;
			}
		}
		for(int[] arr : rst) {
			for(int i : arr) System.out.print(i + " ");
			System.out.println();
		}
	}
}
