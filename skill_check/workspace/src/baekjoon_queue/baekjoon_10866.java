package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/10866 덱
// 큐의 연습 문제와 비슷한 맥락입니다.
// Deque ( 덱 or 데큐 ) 는 데이터의 입출력이 양쪽 모두 가능한 큐 입니다.
// 앞으로도 넣어도 되고 뒤로도 넣어도 되고
// 앞으로 빼도 되고 뒤로 빼도 되는 자료구조 라는 것만 아시면 됩니다.

public class baekjoon_10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new LinkedList<>();
		int n = sc.nextInt();
		while(n-->0) {
			String s = sc.next();
			switch(s) {
			case "push_front" : dq.addFirst(sc.nextInt()); break;
			case "push_back" : dq.addLast(sc.nextInt()); break;
			case "pop_front" : System.out.println(dq.isEmpty() ? -1 : dq.pollFirst()); break;
			case "pop_back" : System.out.println(dq.isEmpty() ? -1 : dq.pollLast()); break;
			case "size" : System.out.println(dq.size()); break;
			case "empty" : System.out.println(dq.isEmpty() ? 1 : 0); break;
			case "front" : System.out.println(dq.isEmpty() ? -1 : dq.peekFirst()); break;
			case "back" : System.out.println(dq.isEmpty() ? -1 : dq.peekLast()); break;
			}
		}
	}
}
