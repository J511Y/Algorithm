package baekjoon_DivideAndConquer;
// https://www.acmicpc.net/problem/1780
// 종이의 개수
import java.util.*;
import java.io.*;
class baekjoon_1780 {
	static int One = 0, Zero = 0, NOne = 0;
	static int[][] map;
	static int Int(String s) {return Integer.parseInt(s);}
	static void divide(int is, int ie, int js, int je) {
		int one = 0, zero = 0, none = 0, max = (ie - is) * (ie - is);
		for(int i = is; i < ie; i++) {
			for(int j = js; j < je; j++) {
				if(map[i][j] == 1) one++;
                if(map[i][j] == 0) zero++;
                if(map[i][j] == -1)none++;
			}
		}
		if(one == max) One++;
		else if(zero == max) Zero++;
        else if(none == max) NOne++;
		else {
			int plus = (ie - is) / 3;
			int i3 = is + plus;
			int j3 = js + plus;
			int i6 = is + (plus * 2);
			int j6 = js + (plus * 2);
			
			divide(is, i3, js, j3);
			divide(is, i3, j3, j6);
            divide(is, i3, j6, je);

			divide(i3, i6, js, j3);
			divide(i3, i6, j3, j6);
			divide(i3, i6, j6, je);

			divide(i6, ie, js, j3);
			divide(i6, ie, j3, j6);
			divide(i6, ie, j6, je);
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
		System.out.print(NOne + "\n" + Zero + "\n" + One);
	}
}
