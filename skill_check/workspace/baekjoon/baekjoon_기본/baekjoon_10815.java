package baekjoon_�⺻;
// https://www.acmicpc.net/problem/10815
// ���� ī��
/*
 * ���� Ǯ�� �� ���� 2020.03.18 22:55
 * --------------
 * HashMap���� Ǯ�� �ݹ� Ǯ����
 */
import java.util.*;
import java.io.*;
public class baekjoon_10815{
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Map<Integer, Integer> map = new HashMap<>();
		int n = Int(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) map.put(Int(st.nextToken()), 1);
		n = Int(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) sb.append(map.getOrDefault(Int(st.nextToken()), 0) + " ");
		System.out.println(sb.toString());
	}
}
