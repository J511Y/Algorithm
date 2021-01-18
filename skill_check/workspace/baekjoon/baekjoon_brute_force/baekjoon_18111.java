package baekjoon_brute_force;

import java.util.*;
import java.io.*;
public class baekjoon_18111 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Int(st.nextToken()), m = Int(st.nextToken()), B = Int(st.nextToken()), t = 1 << 30, h = 0;
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Int(st.nextToken());				
			}
		}
		for(int i = 0; i < 257; i++) {
			int tmp = B, time = 0;
			for(int a = 0; a < n; a++) {
				for(int b = 0; b < m; b++) {
					int d = arr[a][b] - i;
					time += d > 0 ? (2 * d) : (d * -1);
					tmp += d;
				}
			}
			if(tmp >= 0 && time <= t) {
				t = time;
				h = i;
			}
		}
		System.out.println(t + " " + h);
	}
}
