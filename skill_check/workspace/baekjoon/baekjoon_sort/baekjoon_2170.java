package baekjoon_sort;

import java.util.*;
import java.io.*;
public class baekjoon_2170 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Int(br.readLine()), sum = 0, l;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Int(st.nextToken()), b = Int(st.nextToken());
			arr[i][0] = Math.min(a, b);
			arr[i][1] = Math.max(a, b);
		}
		Arrays.sort(arr, (a, b) -> {
			int ar = a[0] - b[0];
			return ar == 0 ? a[1] - b[1] : ar;
		});
		l = arr[0][0];
		for(int[] a : arr) {
			if(a[1] < l) continue;
			l = l >= a[0] ? l : a[0];
			sum += a[1] - l;
			l = a[1];
		}
		System.out.println(sum);
	}
}
