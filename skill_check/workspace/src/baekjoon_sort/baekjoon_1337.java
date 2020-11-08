package baekjoon_sort;

import java.util.*;
public class baekjoon_1337 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min = 5;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = i; j < n && j < i + 5; j++) {
				if(arr[j] < arr[i] + 5) cnt++;
				else break;
			}
			min = Math.min(min, 5 - cnt);
		}
		System.out.println(min);
	}
}
