package baekjoon_DFS_BFS;

import java.util.*;
public class baekjoon_15889 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), flag = 0;
		int[][] arr = new int[n][2];
		boolean[] vst = new boolean[n];
		for(int i = 0; i < n; i++) arr[i][0] = sc.nextInt();
		for(int i = 0; i < n - 1; i++) arr[i][1] = sc.nextInt();
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, arr[0][0] + arr[0][1]});
		vst[0] = true;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int i = p[0] + 1, r = p[1];
			if(i == n) {
				flag = 1;
				break;
			}
			for(; i < n; i++) {
				if(arr[i][0] <= r) {
					if(vst[i] == false) {
						q.add(new int[] {i, arr[i][0] + arr[i][1]});
						vst[i] = true;						
					}
				} else break;
			}
		}
		System.out.println(flag == 1 ? "권병장님, 중대장님이 찾으십니다" : "엄마 나 전역 늦어질 것 같아");
	}
}
