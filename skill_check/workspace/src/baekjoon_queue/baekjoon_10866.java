package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/10866 ��
// ť�� ���� ������ ����� �ƶ��Դϴ�.
// Deque ( �� or ��ť ) �� �������� ������� ���� ��� ������ ť �Դϴ�.
// �����ε� �־ �ǰ� �ڷε� �־ �ǰ�
// ������ ���� �ǰ� �ڷ� ���� �Ǵ� �ڷᱸ�� ��� �͸� �ƽø� �˴ϴ�.

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
