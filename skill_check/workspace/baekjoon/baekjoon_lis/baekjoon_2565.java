package baekjoon_lis;
// https://www.acmicpc.net/problem/2565
// ภüฑ๊มู
import java.util.*;
public class baekjoon_2565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;
		int[] arr = new int[501], dp = new int[501];
		for(int i = 0; i < n; i++) arr[sc.nextInt()] = sc.nextInt();
		for(int i = 0; i < 501; i++){
			if(arr[i] == 0) continue;
			dp[i] = 1;
			for(int j = 0; j <= i; j++){
				if(arr[j] == 0) continue;
				if(dp[i] < dp[j] + 1 && arr[i] > arr[j]) dp[i] = dp[j] + 1;
			}
			max = Math.max(max, dp[i]);
		}
		System.out.print(n - max);
	}
}
