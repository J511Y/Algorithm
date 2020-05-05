package baekjoon_sort;
// https://www.acmicpc.net/problem/1246
// 온라인 판매
import java.util.*;
public class baekjoon_1246 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = n < m ? m - n : 0, max = 0, idx = 0;
		int[] arr = new int[m];
		for(int i = 0; i < m; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(; x < m; x++) {
			int val = (m - x) * arr[x];
			if(max < val) {
				idx = arr[x];
				max = val;
			}
		}
		System.out.println(idx + " " + max);
	}
}
