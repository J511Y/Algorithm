package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_16928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[101], vst = new int[101];
		int n = sc.nextInt(), m = sc.nextInt();
		for(int i = 0; i < n + m; i++) arr[sc.nextInt()] = sc.nextInt();
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1, 0});
		vst[1] = 1;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0], d = p[1];
			if(x == 100) {
				System.out.print(d);
				return;
			}
			for(int i = 1; i <= 6; i++) {
				int next = x + i;
				if(next <= 100 && vst[next] == 0) {
					vst[next] = 1;
					if(arr[next] != 0) next = arr[next];
					vst[next] = 1;
					q.add(new int[] {next, d + 1});
				}
			}
		}
	}
}
