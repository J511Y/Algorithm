package baekjoon_DivideAndConquer;
//https://www.acmicpc.net/problem/2630
//색종이 만들기
import java.util.*;
import java.io.*;
public class baekjoon_2630 {
	static int blue = 0, white = 0;
	static int[][] map;
	static int Int(String s) {return Integer.parseInt(s);}
	static void divide(int is, int ie, int js, int je) {
		int bluecnt = 0;
		for(int i = is; i < ie; i++) {
			for(int j = js; j < je; j++) {
				if(map[i][j] == 1) bluecnt++;
			}
		}
		if((ie - is) * (ie - is) == bluecnt) blue++;
		else if(bluecnt == 0) white++;
		else {
			int ihalf = (is + ie) / 2;
			int jhalf = (js + je) / 2;
			divide(is, ihalf, js, jhalf);
			divide(is, ihalf, jhalf, je);
			divide(ihalf, ie, js, jhalf);
			divide(ihalf, ie, jhalf, je);
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine());
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) map[i][j] = Int(st.nextToken());
		}
		divide(0, n, 0, n);
		System.out.print(white+"\n"+blue);
	}
}
