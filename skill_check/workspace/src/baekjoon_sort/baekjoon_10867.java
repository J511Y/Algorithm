package baekjoon_sort;
// https://www.acmicpc.net/problem/10867
// �ߺ� ���� �����ϱ�
/*
 * ����
N���� ������ �־�����. 
�̶�, N���� ������ ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
���� ������ �� ���� ����Ѵ�.

�Է�
ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. 
��°���� ���ڰ� �־�����. 
�� ���� ������ 1,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� ���� ������������ ������ ����� ����Ѵ�. 
�̶�, ���� ���� �� ���� ����Ѵ�.
 */

/*
 * ���� Ǯ�� �� ���� 2020.02.23 00:52
 * -----------------------------
 * ī���� ���� ����ϸ� �� ��
 */
import java.util.*;
public class baekjoon_10867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2002];
		for(int i = 0; i < n; i++) arr[sc.nextInt() + 1000] = 1;
		for(int i = 0; i < 2002; i++) {
			if(arr[i] == 1) System.out.print((i - 1000) + " ");
		}
	}
}
