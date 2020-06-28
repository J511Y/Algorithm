package baekjoon_recursion;
// https://www.acmicpc.net/problem/1531
// ����

import java.util.*;
public class baekjoon_1531 {
	static int[][] map = new int[101][101];
	static int j, c, d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			// c�� d�� ������� �����Ƿ� static���� ����������.
			c = sc.nextInt();
			d = sc.nextInt();
			// ��͸� �ݺ��ϸ鼭 b(��)�� �� ������ �ʿ��ϹǷ� �Ҵ�����
			j = b;
			// recursion = a, b ���� c, d������ ������ 1 ������Ű�� ����Լ�
			recursion(a, b);
		}
		for(int[] arr : map) {
			for(int i : arr) {
				if(i > m) cnt++;
			}
		}
		System.out.print(cnt);
	}
	static void recursion(int a, int b) {
		// a�� c���� Ŀ���ٸ� ��� ����
		if(a > c) return;
		// b�� d���� Ŀ���ٸ� a�� 1 ����, b�� j�� ���Ҵ�
		else if(b > d) recursion(a + 1, j);
		else {
			// �ش� ���� ī��Ʈ ���� �� ��� ����
			map[a][b]++;
			recursion(a, b + 1);			
		}
	}
}
