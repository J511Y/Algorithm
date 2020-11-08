package baekjoon_two_pointer;

import java.util.*;
public class baekjoon_15831 {
	static int idx(char c) {
		return c == 'B' ? 0 : 1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt(), max = 0;
		char[] arr = sc.next().toCharArray();
		int l = 0, r = 0;
		int[] bw = new int[2];
		while(r < n && l < n) {
			bw[idx(arr[r])]++;
			if(bw[0] <= b && bw[1] >= w) max = Math.max(max, r - l + 1);
			while(bw[0] > b) {
				bw[idx(arr[l])]--;
				l++;
			}
			r++;
		}
		System.out.print(max);
	}
}
