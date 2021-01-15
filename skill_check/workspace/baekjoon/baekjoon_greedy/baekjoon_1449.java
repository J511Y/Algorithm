package baekjoon_greedy;
// https://www.acmicpc.net/problem/1449
// ¼ö¸®°ø Ç×½Â
import java.util.*;
public class baekjoon_1449 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int cnt = 0;
		double last = arr[0] - 0.5;
		for(int i : arr) {
			if(last <= i - 0.5) {
				cnt++;
				last = i - 0.5 + m;
			}
		}
		System.out.print(cnt);
	}
}
