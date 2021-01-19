package baekjoon_DFS_BFS;

import java.util.*;
public class baekjoon_1528 {
	static List<Integer> nums = new ArrayList<>();
	static void makeNum(int n, int num) {
		if(num > n) return;
		if(num > 0) nums.add(num);
		makeNum(n, num * 10 + 4);
		makeNum(n, num * 10 + 7);
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt(), m = n;
		int[] dp = new int[1000010];
		makeNum(n, 0);
		nums.sort(null);
		Arrays.fill(dp, -1);
		Queue<Integer> q = new LinkedList<>();
		for(int i : nums) {
			q.add(i);
			dp[i] = 0;
		}
		while(!q.isEmpty()) {
			int p = q.poll();
			for(int i : nums) {
				int next = i + p;
				if(next <= n && dp[next] == -1) {
					dp[next] = p;
					q.add(next);
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		while(true) {
			list.add((n - dp[n]));
			n = dp[n];
			if(n <= 0) break;
		}
		list.sort(null);
		if(dp[m] == -1 || m == 0) System.out.print(-1);
		else for(int i : list) System.out.print(i + " ");
	}
}
