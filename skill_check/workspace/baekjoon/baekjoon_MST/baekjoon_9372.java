package baekjoon_MST;
// https://www.acmicpc.net/problem/9372
// ������� ����
/*
 * ����
����̴� �ܿ������ �¾� N������ �����ϸ鼭 �ھƸ� ã��� �����Ծ���. 

������ ����̴� ���ο� ����⸦ �������ϱ� ������, �ִ��� ���� ������ ����⸦ Ÿ�� �������� �̵��Ϸ��� �Ѵ�.

�̹� ���� ������ ���� �������� �־����� ��, ����̰� ���� ���� ������ ����⸦ Ÿ�� ��� ���õ��� ������ �� �ֵ��� ��������.

����̰� �� �������� �ٸ� ������ �̵��� �� �ٸ� ������ ���� ����(������ �̹� �湮�� ������) �ȴ�.

�Է�
ù ��° �ٿ��� �׽�Ʈ ���̽��� �� T(T �� 100)�� �־�����,

�� �׽�Ʈ ���̽����� ������ ���� ������ �־�����.

ù ��° �ٿ��� ������ �� N(2 �� N �� 1 000)�� ������� ���� M(1 �� M �� 10 000) �� �־�����.
���� M���� �ٿ� a�� b �ֵ��� �Էµȴ�. a�� b�� �պ��ϴ� ����Ⱑ �ִٴ� ���� �ǹ��Ѵ�. (1 �� a, b �� n; a �� b) 
�־����� ���� �������� �׻� ���� �׷����� �̷��.
���
�׽�Ʈ ���̽����� �� ���� ����Ѵ�.

����̰� ��� ���ø� �����ϱ� ���� Ÿ�� �ϴ� ����� ������ �ּ� ������ ����Ѵ�.
 */

/*
 * ���� Ǯ�� �� ���� 2020.01.28 21:55
 * ----------------
 * ������ ���� �� MST ���� BFS�� ���� ���ö���.
 * �Է� �޴� ��� Ʈ���� �����صΰ� BFS �����ٰ� ��� ������ ������������ �������� �ߴ��ϰ� ī��Ʈ�� ����ϸ� �Ǵ� �� �ƴѰ�..?
 * �� ������ �� MST����... ����� ���µ� MST�� �� ����...? 
 * 
 * ���� Ǯ�� �� �� ���� 2020.01.28 22:03
 * ----------------
 * �������� �� ��ó���ϰ� ���� ��������.
 * ������ ������� �����Ѵٸ� ������ ������ ���� - 1�� �ڸ��ϴϱ� ����� ���� - 1 �� ����ߴ��� �¾Ҵ�.
 * ���� Ƽ�ϰ��� �־�����, ���� ���� �ݾ����θ� ��� ������ �湮�ϴ� ��Ʈ�� ����϶� ������ ��վ����ٵ�.. �ƽ�
 * 
 * ps.
 * �ٵ� ���Ӱ����� �� �� Ʋ�� �������� k��ŭ ���� �� �о�� �Ǵµ� m��ŭ ����
 */
import java.io.*;
public class baekjoon_9372 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);
			bw.write((m - 1) + "\n");
			for(int j = 0; j < k; j++) br.readLine();
		}
		bw.flush();
	}
}