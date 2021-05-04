package baekjoon_Æ®¸®DP;

import java.util.*;
public class baekjoon_1135 {
	static List<List<Integer>> child = new ArrayList<>();
	static int[] dp, parent;
	static int treeDP(int n) {
		int rtn = 0;
		List<Integer> list = child.get(n);
		for(int i : list) dp[i] = treeDP(i) + 1;
		list.sort((a, b) -> dp[b] - dp[a]);
		for(int i = 0; i < list.size(); i++) rtn = Math.max(rtn, dp[list.get(i)] + i);
		return rtn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextInt();
		dp = new int[n];
		parent = new int[n];
		for(int i = 0; i < n; i++) child.add(new ArrayList<>());
		for(int i = 1; i < n; i++) {
			int p = sc.nextInt();
			child.get(p).add(i);
			parent[i] = p;
		}
		System.out.println(treeDP(0));
	}
}
