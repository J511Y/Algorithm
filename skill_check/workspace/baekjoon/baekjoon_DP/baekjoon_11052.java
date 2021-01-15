package baekjoon_DP;
// https://www.acmicpc.net/problem/11052
// 카드 구매하기
import java.util.*;
import java.io.*;
class baekjoon_11052 {
	static int Int(String s) {return Integer.parseInt(s);}
    public static void main(String[] ar) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Int(st.nextToken());
    	int[] arr = new int[n+1], dp = new int[n+1];
    	st = new StringTokenizer(br.readLine());
    	for(int i = 1; i <= n; i++) {
    		arr[i] = Int(st.nextToken());
    	}
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= i; j++) {
    			dp[i] = Math.max(dp[i], arr[j] + dp[i-j]);
    		}
    	}
    	System.out.println(dp[n]);
    }
}