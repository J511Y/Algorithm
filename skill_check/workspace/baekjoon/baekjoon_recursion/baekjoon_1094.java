package baekjoon_recursion;
// https://www.acmicpc.net/problem/1094
// �����
/*
 * ����
�����̴� ���̰� 64cm�� ���븦 ������ �ִ�. 
��� ��, �״� ���̰� Xcm�� ���밡 ������ �;�����. 
�����̴� ���� ������ �ִ� ���븦 �� ���� ����� �ڸ�������, 
Ǯ�� �ٿ��� ���̰� Xcm�� ���븦 ������� �Ѵ�.

���븦 �ڸ��� ���� ���� ����� �������� �ڸ��� ���̴�. 
�����̴� �Ʒ��� ���� ������ ���ļ� ���븦 �ڸ����� �Ѵ�.

�����̰� ������ �ִ� ������ ���̸� ��� ���Ѵ�. 
ó������ 64cm ���� �ϳ��� ������ �ִ�. 
�̶�, ���� X���� ũ�ٸ�, �Ʒ��� ���� ������ �ݺ��Ѵ�.
������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
����, ������ �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� X���� ũ�ų� ���ٸ�, 
������ �ڸ� ������ ���� �� �ϳ��� ������.
����, �����ִ� ��� ���븦 Ǯ�� �ٿ��� Xcm�� �����.
X�� �־����� ��, ���� ������ ��ģ�ٸ�, 
�� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� X�� �־�����. X�� 64���� �۰ų� ���� �ڿ����̴�.

���
������ ������ ��ģ�ٸ�, �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ����Ѵ�
 */

/*
 * ���� Ǯ�� �� ���� 2020.02.22 20:30
 * --------------------
 * ...? �׳� ��Ʈī��Ʈ �ϸ� �Ǵ� ������
 * 
 * ���� Ǯ�� �� �� ���� 2020.02.22 20:33
 * --------------------
 * �³�
 */
public class baekjoon_1094 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println(Integer.bitCount(x));
	}
}