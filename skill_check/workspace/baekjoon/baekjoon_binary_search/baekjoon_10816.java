package baekjoon_binary_search;
// https://www.acmicpc.net/problem/10816
// ���� ī�� 2
/*
 * ���� Ǯ�� �� ���� 2020.04.11 23:37
 * -----------------------------
 * �з��� �̺� Ž���ε� �Է��� �׷��� ���� �ʾƼ� HashMap���� Ǯ���� ������..?
 * 
 * ���� Ǯ�� �� �� ���� 2020.04.11 23:43
 * -----------------------------
 * HashMap���ε� Ǯ�� ����... �̺�Ž���� ���߿� �ٸ� �������� �غ����!
 */
import java.io.*;
import java.util.*;
public class baekjoon_10816 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int n = Int(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Int(st.nextToken());
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		StringBuffer sb = new StringBuffer();
		n = Int(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) sb.append(map.getOrDefault(Int(st.nextToken()), 0) + " ");
		System.out.println(sb.toString());
	}
}
