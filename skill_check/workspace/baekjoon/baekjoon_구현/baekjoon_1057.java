package baekjoon_����;
// https://www.acmicpc.net/problem/1057
// ��ʸ�Ʈ
/*
 * ���� Ǯ�� �� ���� 2020.02.27 20:38
 * -----------------------------
 * ��¡..�׳� ��� �������� Ȧ���� + 1 ¦���� �״�� �ΰ� 2�� ������
 * ���� - 1 ���Ѽ� 2�� ������ ������ �������忡 �����°� �ƴѰ�..?
 * 
 * ���� Ǯ�� �� �� ���� 2020.02.27 20:45
 * -----------------------------
 * �³�..? ����
 */
import java.util.*;
public class baekjoon_1057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt(), cnt = 1;
		while((a - 1) / 2 != (b - 1) / 2) {
			a = (a + (a % 2 == 1 ? 1 : 0)) / 2;
			b = (b + (b % 2 == 1 ? 1 : 0)) / 2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
