package baekjoon_DP;

import java.util.*;
public class baekjoon_14501_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] �ð� = new int[n], �ݾ� = new int[n], �����ݾ� = new int[n+1];
		for(int i = 0; i < n * 2; i++) (i % 2 == 0 ? �ð� : �ݾ�)[i / 2] = sc.nextInt();
		for(int ���� = 0; ���� < n; ����++) {
			//dp[i] = i�ϱ��� ������ �� �� ��
			// i�Ͽ� ���� �ϴ� ���
			int ������ = ���� + �ð�[����];
			if(������ < n + 1) {
				�����ݾ�[������] = Math.max(�����ݾ�[����] + �ݾ�[����], �����ݾ�[������]);
			}
			// i�Ͽ� ���� ���ϴ� ���
			int ������ = ���� + 1;
			�����ݾ�[������] = Math.max(�����ݾ�[����], �����ݾ�[������]);
		}
		System.out.println(�����ݾ�[n]);
	}
}
