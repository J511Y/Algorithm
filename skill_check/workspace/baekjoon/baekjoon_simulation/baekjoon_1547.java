package baekjoon_simulation;
// https://www.acmicpc.net/problem/1547
// ��
// ���� ����
// --------
// �߹��� ���߸� ��.
import java.util.*;
public class baekjoon_1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ball = 1, a, b;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt(); b = sc.nextInt();
			ball = a == ball ? b : b == ball ? a : ball;
		}
		System.out.println(ball);
	}
}
