package baekjoon_DP;
import java.util.*;
public class baekjoon_2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n], dp = new int [n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		if(n < 3) {
			System.out.println(Arrays.stream(arr).sum());
			return;
		}
		dp[0] = arr[0];
        dp[1] = dp[0] + arr[1];
        dp[2] = Math.max(arr[2] + dp[0], arr[2] + arr[1]);
		for(int i=3;i<n;i++)
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i] + arr[i-1]); 
		System.out.println(dp[n-1]);
	}
}
