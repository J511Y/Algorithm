package baekjoon_±âº»;

import java.util.*;
public class baekjoon_20155 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[m+1];
		for(int i = 0; i < n; i++) arr[sc.nextInt()]++;
		System.out.print(Arrays.stream(arr).max().getAsInt());
	}
}
