package baekjoon_æ÷µÂ»§;

import java.util.*;
public class baekjoon_1744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), rst = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int i = 0, j = n - 1;
		for(; i < n - 1; i += 2) {
			if(arr[i] > 0) break;
			if(arr[i+1] > 0) {
				rst += arr[i];
				i--;
			} else rst += arr[i] * arr[i+1];
		}
		for(; j > i; j -= 2) rst += Math.max(arr[j] * arr[j-1], arr[j] + arr[j-1]);
		if(i == j) rst += arr[i];
		System.out.println(rst);
	}
}
