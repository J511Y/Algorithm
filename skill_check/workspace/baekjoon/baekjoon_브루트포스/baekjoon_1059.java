package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int t = sc.nextInt(), l = 1, r = 1000, cnt = 0;
		for(int i : arr) {
			if(i < t) l = i + 1;
			else r = Math.min(r, i);
		}
		for(; l <= t; l++) {
			for(int i = Math.max(l + 1, t); i < r; i++) cnt++;
		}
		System.out.print(cnt);
	}
}
