package baekjoon_기본;
// https://www.acmicpc.net/problem/1920
// 수 찾기
import java.util.*;
import java.io.*;
public class baekjoon_1920 {
	static Integer Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Int(br.readLine());
		Map<Integer, Boolean> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) map.put(Int(st.nextToken()), true);
		n = Int(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sb.append(map.getOrDefault(Int(st.nextToken()), false) ? "1\n" : "0\n");
		}
		System.out.println(sb.toString());
	}
}
