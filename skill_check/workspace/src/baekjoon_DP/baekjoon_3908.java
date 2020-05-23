package baekjoon_DP;
// https://www.acmicpc.net/problem/3908
// 서로 다른 소수의 합
import java.util.*;
public class baekjoon_3908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] dp = new int[1121][15];
		dp[0][0] = 1;
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		for(int i = 2; i < 1121; i++) {
			for(int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
				if(i % j == 0) break;
				if(j == (int)Math.sqrt(i)) list.add(i);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			for(int j = 1120; j >= list.get(i); j--) {
				for(int k = 1; k < 15; k++) {
					dp[j][k] += dp[j - list.get(i)][k - 1];
				}
			}
		}
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			System.out.println(dp[sc.nextInt()][sc.nextInt()]);
		}
	}
}
