package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_12761 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		int[] vst = new int[100001];
		vst[n] = 1;
		q.add(n);
		while(!q.isEmpty()) {
			int p = q.poll();
			if(p == m) {
				System.out.print(vst[p] - 1);
				return;
			}
			int[] arr = {p + 1, p - 1, p + a, p - a, p + b, p - b, p * a, p * b};
			for(int i : arr) {
				if(0 <= i && i < 100001 && vst[i] == 0) {
					q.add(i);
					vst[i] = vst[p] + 1;
				}
			}
		}
	}
}
