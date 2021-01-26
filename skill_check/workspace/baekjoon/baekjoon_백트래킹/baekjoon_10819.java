package baekjoon_백트래킹;

import java.util.*;
public class baekjoon_10819 {
	static int max = 0;
	static void DFS(int[] arr, int bit, int last, int sum) {
		if(bit == (1 << arr.length) - 1) max = Math.max(max, sum);
		for(int i = 0; i < arr.length; i++) {
			if((bit & (1 << i)) == 0) {
				if(bit == 0) sum = Math.abs(last - arr[i]) * -1;
				DFS(arr, bit | (1 << i), arr[i], sum + Math.abs(last - arr[i]));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		DFS(arr, 0, 0, 0);
		System.out.println(max);
	}
}
