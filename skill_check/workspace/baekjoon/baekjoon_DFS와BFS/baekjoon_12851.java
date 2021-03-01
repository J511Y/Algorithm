package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_12851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), cnt = 0, min = 1 << 30;
		int[] vst = new int[100001];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {n, 0});
		vst[n] = 1;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int a = p[0], b = p[1];
			int[] next = {a - 1, a + 1, a * 2};
			if(b > min) break;
			if(a == k) {
				if(b != min) min = b;
				cnt++;
			}
			for(int i : next) {
				if(0 <= i && i < 100001 && (vst[i] == 0 || vst[i] >= b + 1)) {
					q.add(new int[] {i, b + 1});
					vst[i] = b + 1;
				}
			}
		}
		System.out.println(min);
		System.out.print(cnt);
	}
}
