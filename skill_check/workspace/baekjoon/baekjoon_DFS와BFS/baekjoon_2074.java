package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_2074 {
	public static void main(String[] args) {
		int[] arr = new int[20001];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1, 0, 0});
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[0] = arr[1] = 0;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int a = p[0], b = p[1], c = p[2];
//			System.out.println(a + ", " + b + ", " + c);
			arr[a] = Math.min(arr[a], c);
			arr[b] = Math.min(arr[b], c);
			if(a + b < 20001 && arr[a + b] > c + 1) {
				q.add(new int[] {a, a + b, c + 1});
				q.add(new int[] {a + b, b, c + 1});
			}
			if(a * 2 < 20001 && arr[a * 2] > c + 1) {
				q.add(new int[] {a * 2, b, c + 1});
				q.add(new int[] {a, a * 2, c + 1});
			}
			if(b * 2 < 20001 && arr[b * 2] > c + 1) {
				q.add(new int[] {a, b * 2, c + 1});
				q.add(new int[] {b * 2, b, c + 1});
			}
			if(b - a > 0) q.add(new int[] {a, b - a, c + 1});
			if(a - b > 0) q.add(new int[] {a - b, b, c + 1});
		}
		System.out.println(Arrays.toString(arr));
	}
}