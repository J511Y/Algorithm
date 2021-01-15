package baekjoon_sort;
// https://www.acmicpc.net/problem/11652
// Ä«µå

import java.util.*;
public class baekjoon_11652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 1, maxcnt = 0;
		long rst = 0;
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextLong();
		Arrays.sort(arr);
		for(int i = 1; i < n; i++) {
			if(arr[i] != arr[i-1]) {
				if(maxcnt < cnt) {
					rst = arr[i-1];
					maxcnt = cnt;
				}
				cnt = 0;
			}
			cnt++;
		}
		if(maxcnt < cnt) rst = arr[n-1];
		System.out.print(rst);
	}
}
