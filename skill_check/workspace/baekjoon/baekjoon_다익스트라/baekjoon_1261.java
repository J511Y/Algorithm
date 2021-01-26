package baekjoon_다익스트라;
// https://www.acmicpc.net/problem/1261
// 알고스팟

import java.util.*;
public class baekjoon_1261 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), cost = Integer.MAX_VALUE;
		int[][] map = new int[n][m], vst = new int[n][m], WH = {{0, 1, 0, -1}, {1, 0, -1, 0}};
		for(int i = 0; i < n; i++) {
			byte[] arr = sc.next().getBytes();
			for(int j = 0; j < m; j++) map[i][j] = arr[j] - '0';
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> {return a[0] - b[0];});
		pq.add(new int[] {0, 0, 0});
		vst[0][0] = 1;
		while(!pq.isEmpty()) {
			int[] poll = pq.poll();
			int c = poll[0], a = poll[1], b = poll[2];
			if(a == n - 1 && b == m - 1) {
				cost = Math.min(cost, c);
				continue;
			}
			for(int i = 0; i < 4; i++) {
				int A = a + WH[0][i];
				int B = b + WH[1][i];
				if(0 <= A && 0 <= B && A < n && B < m && vst[A][B] == 0) {
					vst[A][B] = 1;
					pq.add(new int[] {c + (map[A][B] == 1 ? 1 : 0), A, B});
				}
			}
		}
		System.out.println(cost);
	}
}
