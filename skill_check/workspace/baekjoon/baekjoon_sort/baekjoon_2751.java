package baekjoon_sort;
// https://www.acmicpc.net/problem/2751
// 수 정렬하기
import java.util.*;
public class baekjoon_2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();
		for(int i : arr) sb.append(i + "\n");
		System.out.println(sb);
	}
}
