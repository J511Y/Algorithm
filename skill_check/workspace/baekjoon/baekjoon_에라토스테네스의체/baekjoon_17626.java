package baekjoon_에라토스테네스의체;

import java.util.*;
public class baekjoon_17626 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Queue<int[]> q = new LinkedList<>();
		boolean[] vst = new boolean[n+1];
		for(int i = 1; i * i <= n; i++) {
			q.add(new int[] {i*i, 1});
			vst[i*i] = true;
		}
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int v = p[0], c = p[1];
			if(v == n) System.out.println(c);
			for(int i = 1; i * i + v <= n; i++) {
				if(!vst[i*i + v]) {
					vst[i*i + v] = true;
					q.add(new int[] {i*i + v, c + 1});
				}
			}
		}
	}
}
