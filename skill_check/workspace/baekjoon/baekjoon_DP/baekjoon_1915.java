package baekjoon_DP;
// https://www.acmicpc.net/problem/1915
// ���� ū ���簢��
/*
 * ���� Ǯ�� �� ���� 2020.04.12 21:16
 * ----------------------------
 * ������ ���� ��Ŀ�� ���Ʈ�����ε� �ذ� �����Ѱ� �ƴѰ�..? �ð��ʰ� ������
 * �ϴ� �غ� ������
 * 
 * ���� Ǯ�� �� �� ���� 2020.04.12 22:04
 * ----------------------------
 * ���Ʈ ������ �����Ƽ� �����ϰ� DP�� �������µ�
 * ���ɴ� �� �߳����µ� ����� �ȵż� �ָԾ���.
 * �˰��� max �⺻ ���� 1�� �����صξ, ���� ū ���簢���� ���̰� 0 �� ��츦 üũ���� ���� ��.
 * �Է� �� 1�� ������ ��츸 max�� 1�� �����صξ����� �������..
 */
import java.util.*;
public class baekjoon_1915 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), max = 0;
		int[][] dp = new int[n][m];
		for(int i = 0; i < n; i++) {
			byte[] bytes = sc.next().getBytes();
			for(int j = 0; j < m; j++) {
				dp[i][j] = bytes[j] - '0';
				if(dp[i][j] == 1) max = 1;
			}
		}
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				if(dp[i][j] != 0) {
					dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		for(int[] d : dp) System.out.println(Arrays.toString(d));
		System.out.println(max * max);
	}
}
