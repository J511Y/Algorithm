package baekjoon_DFS_BFS;

import java.util.*;
public class baekjoon_16965 {
	static List<int[]> list = new ArrayList<>();
	static void bfs(int a, int b) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] vst = new boolean[list.size()];
		q.add(a);
		vst[a] = true;
		int flag = 0;
		while(!q.isEmpty()) {
			int idx = q.poll();
			if(idx == b) flag = 1;
			int[] p = list.get(idx);
			int l = p[0], r = p[1];
			for(int i = 1; i < vst.length; i++) {
				int x = list.get(i)[0], y = list.get(i)[1];
				if(((x < l && l < y) || (x < r && r < y)) && !vst[i]) {
					vst[i] = true;
					q.add(i);
				}
			}
		}
		System.out.println(flag);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		list.add(null);
		for(int i = 0; i < n; i++) {
			int q = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			if(q == 1) list.add(new int[] {a, b});
			else bfs(a, b);
		}
	}
}
