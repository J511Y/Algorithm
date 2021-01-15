package baekjoon_DP;
//https://www.acmicpc.net/problem/2293
//µ¿Àü1
import java.util.*;
class baekjoon_2293 {
    public static void main(String[] ar) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt() + 1, k = sc.nextInt();
    	int[] coin = new int[n], dp = new int[10001];
    	for(int i = 1; i < n; i++) coin[i] = sc.nextInt();
    	dp[0] = 1;
    	for(int i = 1; i < n; i++) {
    		for(int j = coin[i]; j <= k; j++) {
    			dp[j] += dp[j - coin[i]];
    		}
    	}
    	System.out.println(dp[k]);
    }
}
