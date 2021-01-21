package baekjoon_priorityqueue;

import java.util.*;
public class baekjoon_1417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), dasom = sc.nextInt(), cnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for(int i = 1; i < n; i++) pq.add(sc.nextInt());
		while(!pq.isEmpty() && pq.peek() >= dasom) {
			cnt++;
			dasom++;
			pq.add(pq.poll() - 1);
		}
		System.out.println(cnt);
	}
}
