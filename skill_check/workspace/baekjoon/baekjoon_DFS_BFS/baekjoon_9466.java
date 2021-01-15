package baekjoon_DFS_BFS;

import java.util.*;
public class baekjoon_9466 {
	static int cnt;
	static void dfs(int[] arr, boolean[] vst, boolean[] done, int x) {
		vst[x] = true;
		int n = arr[x];
		if(vst[n] == false) dfs(arr, vst, done, n);
		else if(done[n] == false) {
			for(int i = n; i != x; i = arr[i]) cnt++;
			cnt++;
		}
		done[x] = true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			cnt = 0;
			int[] arr = new int[n+1]; 
			boolean[] vst = new boolean[n+1], done = new boolean[n+1];
			for(int i = 0; i < n; i++) arr[i+1] = sc.nextInt();
			for(int i = 1; i <= n; i++) {
				if(vst[i] == false) {
					dfs(arr, vst, done, i);
				}
			}
			System.out.println(n - cnt);
		}
	}
}
