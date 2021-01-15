package baekjoon_DP;

import java.util.*;
public class baekjoon_15991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nmg = 1000000009, tc = sc.nextInt();
		int[] arr = new int[100001];
		arr[0] = arr[1] = 1;
		arr[2] = arr[3] = 2;
		for(int i = 4; i < 100001; i++) {
			int tmp = arr[i-2];
			tmp = (tmp + arr[i-4]) % nmg;
			if(i > 5) tmp = (tmp + arr[i-6]) % nmg;
			arr[i] = tmp;
		}
		for(int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}
}
