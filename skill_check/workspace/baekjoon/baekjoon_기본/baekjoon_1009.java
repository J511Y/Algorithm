package baekjoon_�⺻;
// https://www.acmicpc.net/problem/1009
// �л�ó��

// A�� B�� �����ؼ� ������ 1�� �ڸ��� ���� ����
import java.util.*;
public class baekjoon_1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = a % 10;
			for(int j = 1; j < b; j++) c = (c * a) % 10;
			System.out.println(c == 0 ? 10 : c);
		}
	}
}
