package baekjoon_LIS;
// https://www.acmicpc.net/problem/11054
// ���� �� ������� �κ� ����
/*
 * ���� Ǯ�� �� ���� 2020.04.08 21:25
 * -----------------------------
 * �������� ��ũ���ǵ� �ۼ��ϸ鼭 ������ Ǯ����� �Ѵ�.
 * �� ���� �������� �ǹ� ������ Ǯ������ �ǿ��� �������� �� ���Ƽ�..
 * ��ư ���� Ǯ�� ���� ��� �������δ� LIS LDS �� ���� ���� �������� max���� �����ָ� ���� ������ �ϴ� �����̴�.
 * �Է��� �۾Ƽ� �´� Ǯ�������� Ȯ������ ������.. �غ��� �ٽ� �;�¡
 * 
 * ���� Ǯ�� �� �� ���� 2020.04.08 21:45
 * -----------------------------
 * �±� �¾Ҵµ� ���� �� ����..
 * ����� LIS ���� Ǫ�°� �����ΰ��� ����ΰ��� ã�ƺ��߰ڴ�.
 */
import java.util.*;
public class baekjoon_11054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;
		int[] left = new int[n], right = new int[n], LIS = new int[n+1], LDS = new int[n + 1];
		for(int i = 0; i < n; i++) right[n - i - 1] = left[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			LIS[i] = 1; LDS[i] = 1;
			for(int j = 0; j < i; j++) {
				if(left[i] > left[j]) LIS[i] = Math.max(LIS[i], LIS[j] + 1);
				if(right[i] > right[j]) LDS[i] = Math.max(LDS[i], LDS[j] + 1);
			}
		}
		for(int i = 0; i < n; i++) max = Math.max(max, LIS[i] + LDS[n - i - 1] - 1);
		System.out.println(max);
	}
}
