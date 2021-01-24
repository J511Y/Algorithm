package baekjoon_basic;

import java.util.*;
public class baekjoon_12836 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		long[] arr = new long[n+1];
		for(int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if(t == 1) arr[sc.nextInt()] += sc.nextInt();
			else {
				int s = sc.nextInt(), e = sc.nextInt();
				long sum = 0;
				for(; s <= e; s++) sum += arr[s];
				System.out.println(sum);
			}
		}
	}
}
