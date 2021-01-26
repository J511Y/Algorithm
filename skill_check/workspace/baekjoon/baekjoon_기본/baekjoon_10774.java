package baekjoon_±âº»;

import java.util.*;
public class baekjoon_10774 {
	static int size(String s) {
		return s.charAt(0) == 'S' ? 0 : s.charAt(0) == 'M' ? 1 : 2; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		int[] arr = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = size(sc.next());
		for(int i = 0; i < m; i++) {
			int size = size(sc.next()), idx = sc.nextInt();
			if(arr[idx] != -1 && arr[idx] >= size) {
				arr[idx] = -1;
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
