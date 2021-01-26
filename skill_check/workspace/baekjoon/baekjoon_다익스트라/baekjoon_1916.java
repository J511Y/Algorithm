package baekjoon_���ͽ�Ʈ��;
// https://www.acmicpc.net/problem/1916
// �ּҺ�� ���ϱ�
/*
 * ����
N�� ���ð� �ִ�. 
�׸��� �� ���ÿ��� ����Ͽ� �ٸ� ���ÿ� �����ϴ� M���� ������ �ִ�. 
�츮�� A��° ���ÿ��� B��° ���ñ��� ���µ� ��� ���� ����� �ּ�ȭ ��Ű���� �Ѵ�. 
�׷��� A��° ���ÿ��� B��° ���ñ��� ���µ� ��� �ּҺ���� ����Ͽ���. 
������ ��ȣ�� 1���� N�����̴�.

�Է�
ù° �ٿ� ������ ���� N(1 �� N �� 1,000)�� �־����� ��° �ٿ��� ������ ���� M(1 �� M �� 100,000)�� �־�����. 
�׸��� ��° �ٺ��� M+2�ٱ��� ������ ���� ������ ������ �־�����. 
���� ó������ �� ������ ��� ������ ��ȣ�� �־�����. 
�׸��� �� �������� �������� ���� ��ȣ�� �־����� �� �� ���� ����� �־�����. 
���� ����� 0���� ũ�ų� ����, 100,000���� ���� �����̴�.

�׸��� M+3° �ٿ��� �츮�� ���ϰ��� �ϴ� ���� ������� ���ù�ȣ�� �������� ���ù�ȣ�� �־�����. 
��������� �������� �� �� �ִ� ��츸 �Է����� �־�����.
 */

/*
 * ���� Ǯ�� �� ���� 2020.02.09 22:59
 * -----------------------------
 * ������ Ǯ���� ��� �����ϸ� �� �� ����.
 * �ڵ尡���;�¡
 * 
 * ���� Ǯ�鼭 �� ���� 2020.02.09 23:37
 * -----------------------------
 * �ƴϤӤӤӤӤӤӤӤӤӤӤӤӤӤӤ�
 * �� �ȵǴµ�?
 * ����
 * ���� �𸣰ڴµ�
 * ����������
 * �׽�Ʈ���̽� �� �� �����µ�
 * �� ����ġ�� ��¥
 */
import java.util.*;
import java.io.*;
public class baekjoon_1916 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MAX_VALUE;
		int n = Integer.parseInt(br.readLine()) + 1, m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 1; i < n; i++) Arrays.fill(arr[i], max);
		int[] rst = new int[n], vst = new int[n];
		StringTokenizer st;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a][b] = Math.min(arr[a][b], c);
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), cnt = 1;
		vst[s] = 1;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return a[1] - b[1];}) ;
		for(int i = 1; i < n; i++) {
			if(arr[s][i] != max) {
				pq.add(new int[] {i, arr[s][i]});
			}
		}
		while(cnt < n - 1 && !pq.isEmpty()) {
			int[] tmp = pq.poll();
			int a = tmp[0], b = tmp[1];
			if(vst[a] == 0) {
				cnt++;
				vst[a] = 1;
				rst[a] = b;
				for(int i = 1; i < n; i++) {
					if(vst[i] == 0 && arr[a][i] != max) {
						b += arr[a][i];
						pq.add(new int[] {i, b});
					}
				}
			}
		}
		System.out.println(rst[e]);
	}
}
