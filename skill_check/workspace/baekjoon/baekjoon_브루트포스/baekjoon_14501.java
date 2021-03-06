package baekjoon_브루트포스;
import java.util.*;
public class baekjoon_14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][2];
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int[] dp = new int[n+1];
		int max = 0;
		for(int i=n-1; i>=0; i--){
			if(dp[i] == 0) dp[i] = dp[i+1];
			if(i + (arr[i][0]) > n) continue;
			dp[i] = Math.max((dp[i+arr[i][0]] + arr[i][1]) , dp[i]);
			max = Math.max(dp[i], max);
		}

		System.out.println(max);
	}
}
