package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/2164 ī��2
public class baekjoon_2164 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt(); // �� ���� ������ �޸� ���� ������
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) q.add(i);
		while(q.size() > 1) {
			q.poll();
			if(q.size() == 1) break;
			q.add(q.poll()); // ť�� �� �� �ڷḦ �� �� �ڷ� �ֱ�
		}
		System.out.println(q.poll());
	}
}
