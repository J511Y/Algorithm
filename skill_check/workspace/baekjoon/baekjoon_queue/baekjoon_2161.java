package baekjoon_queue;
// https://www.acmicpc.net/problem/2161
// ī��1
/*
 * ���� Ǯ�� �� ���� 2020.04.19 21:46
 * ----------------------------
 * DEQUE �Ἥ �ҵ� �����ҵ�
 */
import java.util.*;
public class baekjoon_2161 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Deque<Integer> dq = new LinkedList<>(); 
		for(int i = 1; i <= n; i++) dq.addLast(i);
		while(true) {
			System.out.print(dq.pollFirst() + " ");
			if(!dq.isEmpty())dq.addLast(dq.pollFirst());
			else break;
		}
	}
}
