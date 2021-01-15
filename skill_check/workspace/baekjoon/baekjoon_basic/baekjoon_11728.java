package baekjoon_basic;
// https://www.acmicpc.net/problem/11728
// �迭 ��ġ��
/*
 * ������ �������� �˾Ҵµ� ����Ʈ�� �ȸ�������
 * ������Ʈ�� �ذ�
 */
import java.util.*;
import java.io.*;
public class baekjoon_11728 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
		int[] aArr = new int[a], bArr = new int[b];
		aArr = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		bArr = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		int A = 0, B = 0;
		while(A < a && B < b) {
			sb.append((aArr[A] < bArr[B] ? aArr[A++] : bArr[B++]) + " ");
		}
		while(A < a) sb.append(aArr[A++] + " ");
		while(B < b) sb.append(bArr[B++] + " ");
		System.out.println(sb.toString());
	}
}
