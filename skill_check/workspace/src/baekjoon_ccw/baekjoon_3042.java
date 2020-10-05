package baekjoon_ccw;
//https://www.acmicpc.net/problem/3042

import java.util.*;
public class baekjoon_3042 {
	static int ccw(int[] a, int[] b, int[] c) {
		int x1 = a[0], y1 = a[1], x2 = b[0], y2 = b[1], x3 = c[0], y3 = c[1];
		int result = x1*y2 + x2*y3 + x3*y1;
		result -= y1*x2 + y2*x3 + y3*x1;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		List<int[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			char[] arr = sc.next().toCharArray();
			for(int j = 0; j < n; j++) {
				if(arr[j] != '.') list.add(new int[] {i, j});
			}
		}
		
		n = list.size();
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					cnt += ccw(list.get(i), list.get(j), list.get(k)) == 0 ? 1 : 0;
				}
			}
		}
		System.out.println(cnt);
	}
}
