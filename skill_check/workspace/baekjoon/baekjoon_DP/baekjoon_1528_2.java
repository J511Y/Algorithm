package baekjoon_DP;

import java.util.*;
public class baekjoon_1528_2 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(4); q.add(7);
		while(!q.isEmpty()) {
			int p = q.poll();
			list.add(p);
			int a = p * 10 + 4, b = p * 10 + 7;
			if(a <= n) q.add(a);
			if(b <= n) q.add(b);
		}
		list.sort(null);
		int[] dp = new int[n + 1], index = new int[n + 1];
		Arrays.fill(dp, 1 << 30);
		Arrays.fill(index, -1);
		for(int i : list) {
			if(i > n) break;
			dp[i] = 1;
			index[i] = 0;
		}
		for(int i = 4; i <= n; i++) {
			if(dp[i] == -1) continue;
			for(int j : list) {
				if(i + j > n) break;
				if(dp[i+j] > dp[i] + 1) {
					dp[i+j] = dp[i] + 1;
					index[i+j] = i;
				}
			}
		}
		if(dp[n] == 1 << 30) System.out.println(-1);
		else {
			list = new ArrayList<>();
			while(index[n] != -1) {
				list.add(n - index[n]);
				n = index[n];
			}
			list.sort(null);
			for(int i : list) System.out.print(i + " ");
		}
	}
}
