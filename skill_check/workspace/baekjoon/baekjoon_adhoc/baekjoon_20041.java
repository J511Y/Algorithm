package baekjoon_adhoc;

import java.io.*;
import java.util.*;
public class baekjoon_20041 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine());
		int[] escape = new int[4];
		int[][] police = new int[n][2];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			police[i] = new int[] {Int(st.nextToken()), Int(st.nextToken())};
		}
	}
}
