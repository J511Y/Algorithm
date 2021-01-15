package baekjoon_two_pointer;

import java.util.*;
public class baekjoon_2428 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int left = 0, right = 0;
		while(left < n) {
			while(right < n - 1 && arr[right + 1] * 0.9d <= arr[left]) right++;
			cnt += right - left;
			left++;
		}
		System.out.println(cnt);
	}
}
