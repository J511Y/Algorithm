package baekjoon_ДЉРћЧе;

import java.util.*;
public class baekjoon_3013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), b = sc.nextInt();
		int[] arr = new int[n], sum = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) sum[i] = (arr[i] > b ? 1 : arr[i] < b ? -1 : 0) + (i > 0 ? sum[i-1] : 0);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sum));
	}
}
