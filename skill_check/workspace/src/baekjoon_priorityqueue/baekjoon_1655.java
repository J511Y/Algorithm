package baekjoon_priorityqueue;
// https://www.acmicpc.net/problem/1655
// 가운데를 말해요
import java.util.*;
public class baekjoon_1655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> min = new PriorityQueue<Integer>((a, b)->{return a - b;}), max = new PriorityQueue<Integer>((a, b)->{return b - a;});
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int next = sc.nextInt();
			if(min.size() == max.size()) max.add(next);
			else min.add(next);
			
			if((min.isEmpty() || max.isEmpty()) == false && min.peek() < max.peek()) {
				int a = min.poll();
				min.add(max.poll());
				max.add(a);
			}
			System.out.println(max.peek());
		}
	}
}
