package baekjoon_binary_search;
// https://www.acmicpc.net/problem/10816
// 숫자 카드 2
/*
 * 문제 풀기 전 생각 2020.04.11 23:37
 * -----------------------------
 * 분류는 이분 탐색인데 입력이 그렇게 많지 않아서 HashMap으로 풀릴것 같은디..?
 * 
 * 문제 풀고 난 후 생각 2020.04.11 23:43
 * -----------------------------
 * HashMap으로도 풀림 ㅇㅇ... 이분탐색은 나중에 다른 문제에서 해보기로!
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
