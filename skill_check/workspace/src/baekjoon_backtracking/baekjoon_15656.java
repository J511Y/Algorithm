package baekjoon_backtracking;

import java.util.*;
public class baekjoon_15656 {
	static int[] arr;
	static int n, m;
	static StringBuffer sb = new StringBuffer();
	static void BT(int cnt, String s) {
		if(cnt == m) {
			sb.append(s.trim()+"\n");
			return;
		}
		for(int i = 0; i < n; i++) {
			BT(cnt + 1, s + arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		BT(0, "");
		System.out.print(sb);
	}
}
