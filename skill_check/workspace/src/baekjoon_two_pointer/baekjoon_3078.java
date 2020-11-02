package baekjoon_two_pointer;

import java.util.*;
public class baekjoon_3078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long rst = 0;
		int[] arr = new int[n], cnt = new int[21];
		for(int i = 0; i < n; i++) arr[i] = sc.next().length();
		for(int i = 0; i < k; i++) cnt[arr[i]]++;
		for(int i = 0; i < n; i++) {
			cnt[arr[i]]--;
			if(i + k < n) cnt[arr[i + k]]++;
			rst += cnt[arr[i]];
		}
		System.out.println(rst);
	}
}
