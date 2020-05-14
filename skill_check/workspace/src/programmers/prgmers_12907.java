package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12907
// 거스름돈
// DP문제
import java.util.*;
public class prgmers_12907 {
	public int solution(int n, int[] money) {
        Arrays.sort(money);
		int[] dp = new int[100001];
        dp[0] = 1;
        for(int i = money[0]; i <= n; i += money[0]) dp[i]++;
		for(int i = 1; i < money.length; i++){
			for(int j = money[i]; j <= n; j++){
				dp[j] = (dp[j] + dp[j - money[i]]) % 1000000007;
			}
		}
        return dp[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
