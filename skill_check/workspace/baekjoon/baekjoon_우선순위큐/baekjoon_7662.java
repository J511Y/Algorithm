package baekjoon_우선순위큐;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class baekjoon_7662 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Int(br.readLine());
		while(t-->0) {
			int n = Int(br.readLine());
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				int b = Int(st.nextToken());
				if(a.equals("I")) {
					map.put(b, map.getOrDefault(b, 0) + 1);
				}else {
					Entry<Integer, Integer> ent = b == -1 ? map.pollFirstEntry() : map.pollLastEntry();
					if(ent == null) continue;
					else {
						if(ent.getValue() > 1) map.put(ent.getKey(), ent.getValue() - 1);
					}
				}
			}
			sb.append((map.isEmpty() ? "EMPTY" : (map.lastKey() + " " + map.firstKey())) + "\n");
		}
		System.out.print(sb);
	}
}
