package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/1021 회전하는 큐
public class baekjoon_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new LinkedList<>();
		int n = sc.nextInt(), m = sc.nextInt(), rst = 0;
		for(int i = 1; i <= n; i++) dq.addLast(i);
		for(int i = 0; i < m; i++) {
			int target = sc.nextInt();
			int cnt = 0;
			int[] arr = dq.stream().mapToInt(s->Integer.parseInt(s+"")).toArray();
			int idx = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == target) {
					idx = j;
					break;
				}
			}
			
			if(idx <= dq.size() / 2) {
				while(dq.peekFirst() != target) {
					dq.addLast(dq.pollFirst());
					cnt++;
				}
				dq.pollFirst();
				rst += cnt;
			}else {
				while(dq.peekFirst() != target) {
					dq.addFirst(dq.pollLast());
					cnt++;
				}
				dq.pollFirst();
				rst += cnt;
			}
		}
		
		System.out.println(rst);

	}
}
