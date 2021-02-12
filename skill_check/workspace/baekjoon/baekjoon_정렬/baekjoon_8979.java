package baekjoon_Á¤·Ä;

import java.util.*;
public class baekjoon_8979 {
	static boolean same(int[] a, int[] b) {
		return b == null ? false : a[1] == b[1] && a[2] == b[2] && a[3] == b[3];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] arr = new int[n][4];
		for(int i = 0; i < n; i++) arr[i] = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr, (a, b) -> {
			int A = a[1] - b[1];
			int B = a[2] - b[2];
			int C = a[3] - b[3];
			return A == 0 ? B == 0 ? C : B : A;
		});
		for(int i = 0, j = 0; i < n; i++) {
			int[] a = arr[i], b = i > 0 ? arr[i - 1] : null;
			if(same(a, b) == false) j++;
			if(a[0] == m) System.out.println(j);
		}
	}
}
