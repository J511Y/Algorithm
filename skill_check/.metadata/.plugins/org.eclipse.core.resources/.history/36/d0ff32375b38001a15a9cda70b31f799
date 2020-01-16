package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/2164 카드2
public class baekjoon_2164 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt(); // 한 번만 쓰여서 메모리 등재 안했음
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) q.add(i);
		while(q.size() > 1) {
			q.poll();
			if(q.size() == 1) break;
			q.add(q.poll()); // 큐의 맨 앞 자료를 빼 맨 뒤로 넣기
		}
		System.out.println(q.poll());
	}
}
