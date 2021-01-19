package baekjoon_DP;

import java.util.*;
public class baekjoon_1528 {
	static int[] dp = new int[1000010], idx = new int[dp.length];
	static List<Integer> nums = new ArrayList<>();
	static void makeNum(int n, int num) {
		if(num > n) return;
		if(num > 0) nums.add(num);
		makeNum(n, num * 10 + 4);
		makeNum(n, num * 10 + 7);
	}
	static int DP(int n) {
		if(n < 0) return 1 << 30;
		if(dp[n] != -1) return dp[n];
		int min = 1 << 30, val = 0;
		for(int i : nums) {
			if(n - i < 0) continue;
			min = Math.min(min, DP(n - i) + 1);
			if(min == dp[n - i] + 1) val = i;
		}
		idx[n] = n - val;
		return dp[n] = min;
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		makeNum(n, 0);
		nums.sort(Collections.reverseOrder());
		Arrays.fill(dp, -1);
		Arrays.fill(idx, -1);
		dp[0] = 0;
		int min = DP(n);
		List<Integer> list = new ArrayList<>();
		while(min != 1 << 30) {
			list.add((n - idx[n]));
			n = idx[n];
			if(n <= 0) break;
		}
		list.sort(null);
		if(min == 1 << 30) System.out.print(-1);
		else for(int i : list) System.out.print(i + " ");
	}
}
