package baekjoon_DP;


// https://www.acmicpc.net/problem/11057
// 오르막 수
import java.util.*;
public class baekjoon_11057 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[] {1,1,1,1,1,1,1,1,1,1};
		for(int i = 1; i < n; i++) {
			int[] tmp = new int[10];
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k <= j; k++) {
					tmp[j] = (arr[k] + tmp[j]) % 10007;
				}
			}
			arr = tmp;
		}
		System.out.println(Arrays.stream(arr).sum() % 10007);
	}
}
