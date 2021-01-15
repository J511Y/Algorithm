package baekjoon_bitmask;
// https://www.acmicpc.net/problem/11723
// С§Че

import java.util.*;
import java.io.*;
class baekjoon_11723{
	static int Int(String s){
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine()), bit = 0, full = (1 << 21) - 1;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int j = st.hasMoreTokens() ? (1 << Int(st.nextToken())) : -1;
			switch(s){
				case "add":bit = bit | j; break;
				case "remove":bit = bit ^ j; break;
				case "toggle":bit = bit ^ (full & j); break;
				case "check":sb.append(((bit & j) > 0 ? 1 : 0) + "\n"); break;
				case "all":bit = full; break;
				case "empty":bit = 0; break;
			}
		}
		System.out.println(sb.toString());
	}
}
