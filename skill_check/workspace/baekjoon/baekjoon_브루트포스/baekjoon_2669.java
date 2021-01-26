package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_2669 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[101][101];
		for(int tc = 0; tc < 4; tc++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			for(int i = a; i < c; i++) {
				for(int j = b; j < d; j++) {
					arr[i][j] = 1;
				}
			}
		}
		int sum = 0;
		for(int[] a : arr) for(int i : a) sum += i;
		System.out.println(sum);
	}
}
