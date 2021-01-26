package baekjoon_기본수학;
// https://www.acmicpc.net/problem/1940
// 주몽
import java.util.*;
public class baekjoon_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[100000001];
		for(int i = 0; i < n; i++) arr[sc.nextInt()]++;
		int cnt = m % 2 == 0 ? arr[m / 2] / 2 : 0;
		for(int i = 1; i <= (m - 1) / 2; i++) {
			cnt += (arr[i] + arr[m - i]) / 2;
		}
		System.out.println(cnt);
	}
}
