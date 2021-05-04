package baekjoon_ÀÌºÐÅ½»ö;

import java.util.*;
public class baekjoon_17383 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long l = 1, r = 0;
		for(int i = 0; i < n; i++) r = Math.max(r, arr[i] = sc.nextInt());
		while(l < r) {
			long mid = (l + r) / 2, sum = 0;
			for(long i : arr) sum += 2 - ((i / mid) + (i % mid > 0 ? 1 : 0));
			if(sum > 0) r = mid;
			else l = mid + 1;
		}
		System.out.print(r);
	}
}
