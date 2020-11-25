package baekjoon_simulation;

import java.util.*;
public class baekjoon_1713 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		// 0 : 추천, 1 : 인덱스, 2 : 번호
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
		for(int i = 0; i < k; i++) {
			int m = sc.nextInt();
			PriorityQueue<int[]> tmp = new PriorityQueue<>((a, b)-> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
			boolean flag = false;
			while(!pq.isEmpty()) {
				int[] p = pq.poll();
				if(p[2] == m) {
					flag = true;
					p[0]++;
				}
				tmp.add(p);
			}
			if(!flag) {
				if(tmp.size() == n) tmp.poll();
				tmp.add(new int[] {1, i, m});
			}
			pq = tmp;
		}
		int[] arr = new int[pq.size()];
		for(int i = 0; i < arr.length; i++) arr[i] = pq.poll()[2];
		Arrays.sort(arr);
		for(int i : arr) System.out.print(i + " ");
	}
}
