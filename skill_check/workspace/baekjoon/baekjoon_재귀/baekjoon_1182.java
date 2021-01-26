package baekjoon_재귀;
// https://www.acmicpc.net/problem/1182
// 부분수열의 합
import java.util.*;
public class baekjoon_1182 {
	static int cnt = 0, s, n;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); s = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) recursion(i, arr[i]);
		System.out.print(cnt);
	}
	static void recursion(int idx, int val) {
		if(val == s) cnt++;
		for(int i = idx + 1; i < n; i++) recursion(i, val + arr[i]);
	}
}
