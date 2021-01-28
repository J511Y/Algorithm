package baekjoon_ÇØ½Ã¸Ê;

import java.util.*;
import java.io.*;
public class baekjoon_17219 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		for(int i = 0; i < m; i++) sb.append(map.get(br.readLine()) + "\n");
		System.out.print(sb);
	}
}
