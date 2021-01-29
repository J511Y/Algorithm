package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_9205 {
	static boolean calc(int[] a, int[] b) {
		return (Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1])) <= 1000;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(), find = 0;
			int[][] arr = new int[n+2][];
			int[] vst = new int[n+2];
			vst[0] = 1;
			for(int i = 0; i < n + 2; i++) arr[i] = new int[] {sc.nextInt(), sc.nextInt()};
			Queue<Integer> q = new LinkedList<>();
			q.add(0);
			while(!q.isEmpty()) {
				int p = q.poll();
				if(p == n + 1) find = 1;
				for(int i = 1; i <= n + 1; i++) {
					if(vst[i] == 0 && calc(arr[p], arr[i])) {
						vst[i] = 1;
						q.add(i);
					}
				}
			}
			System.out.println(find == 0 ? "sad" : "happy");
		}
	}
}
