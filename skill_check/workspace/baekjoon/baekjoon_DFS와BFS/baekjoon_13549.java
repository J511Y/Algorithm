package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_13549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		PriorityQueue<int[]> q = new PriorityQueue<>((n, m) -> n[1] - m[1] == 0 ? n[0] - m[0] : n[1] - m[1]);
		boolean[] vst = new boolean[100001];
		vst[a] = true;
		q.add(new int[] {a, 0});
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int n = p[0], d = p[1];
			if(n == b) {
				System.out.print(d);
				return;
			}
			int[] move = {n * 2, n - 1, n + 1};
			for(int i = 0; i < 3; i++) {
				int next = move[i];
				if(0 <= next && next < vst.length && !vst[next]) {
					vst[next] = true;
					q.add(new int[] {next, d + (i == 0 ? 0 : 1)});
				}
			}
		}
	}
}
