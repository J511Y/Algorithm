package baekjoon_ť;
import java.util.*;
public class baekjoon_9834 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		char[] commands = sc.next().toCharArray();
		Deque<Integer> q = new LinkedList<>();
		for(int i = 0; i < n; i++) q.add(i);
		for(char c : commands) {
			if(c == '.') break;
			if(c == 'A') q.addLast(q.pollFirst());
			else {
				int i = q.pollFirst();
				q.addLast(q.pollFirst());
				q.addFirst(i);
			}
		}
		for(int i = 0; i < m - 1; i++) q.pollFirst();
		for(int i = 0; i < 3; i++) System.out.print(q.pollFirst() + " ");
	}
}
