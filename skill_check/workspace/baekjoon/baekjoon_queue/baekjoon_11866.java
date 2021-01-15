package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/11866 �����۽� ���� 0
// ���� ���ظ� ���� ���� (������ ����)
// 1 2 3 4 5 6 7 ->�� ť�� �־�ΰ� k ��°�� ���� ��� ���� ��
// 1 2 3 4 5 6 7 -> ���� 3��°�� 3�̹Ƿ� 3�� ����ϸ鼭 ����
// 1 2 4 5 6 7   -> 3�� ���� ���
// 4 5 6 7 1 2   -> 3���� �����߾����Ƿ� ���� 4���� ����
// 4 5 6 7 1 2   -> ���� ���¿��� 3��°�� 6
// 4 5 7 1 2     -> ���� �����ϰ� ����
// 7 1 2 4 5     -> �̷������� ���ư��� ���� ����� ��.
//------------------------
// ť�� ���� ���
// 1 2 3 4 5 6 7
// 2 3 4 5 6 7 1
// 3 4 5 6 7 1 2
// -->> 3�� �������Ƿ� ť�� �� �� �ڷḦ ����.(��µ� ����)
// 4 5 6 7 1 2
// 5 6 7 1 2 4
// 6 7 1 2 4 5
// -->> 3�� �������Ƿ� ť�� �� �� �ڷḦ ����.(��µ� ����)
// �� ����� ť�� �������� �ݺ�
public class baekjoon_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i < N + 1; i++) que.add(i);
		System.out.print("<");
		while (!que.isEmpty()) {
			for (int i = 0; i < K; i++) {
				if (i == K - 1) System.out.print(que.poll());
				else que.add(que.poll());
			}
			
			if (que.isEmpty()) System.out.print(">");
			else System.out.print(", ");
		}

	}
}
