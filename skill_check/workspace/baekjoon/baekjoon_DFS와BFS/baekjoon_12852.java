package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_12852 {
	static int[] dp = new int[1000001];
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		while(!q.isEmpty()) {
			int p = q.poll();
			int[] arr = {p + 1, p * 2, p * 3};
			for(int i = 0; i < 3; i++) {
				if (arr[i] <= n && dp[arr[i]] == 0) {
					dp[arr[i]] = p;
					q.add(arr[i]);
				}				
			}
		}
		List<Integer> list = new ArrayList<>();
		while(dp[n] != 0) {
			list.add(n);
			n = dp[n];
		}
		System.out.println(list.size());
		list.add(1);
		for(int i : list) System.out.print(i + " ");
	}
}
