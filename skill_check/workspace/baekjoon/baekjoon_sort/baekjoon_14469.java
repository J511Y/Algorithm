package baekjoon_sort;

import java.util.*;
public class baekjoon_14469 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), time = 0;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		for(int[] a : arr) {
			if(a[0] >= time) time = a[0] + a[1];
			else time += a[1];
		}
		System.out.print(time);
	}
}
