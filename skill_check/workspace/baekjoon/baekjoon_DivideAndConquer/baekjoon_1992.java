package baekjoon_DivideAndConquer;
// https://www.acmicpc.net/problem/1992
// Äõµå Æ®¸®
import java.util.*;
public class baekjoon_1992 {
	static byte[][] map;
	static StringBuffer sb = new StringBuffer();
	static void divide(int is, int ie, int js, int je) {
		int onecnt = 0;
		for(int i = is; i < ie; i++) {
			for(int j = js; j < je; j++) {
				if(map[i][j] == '1') onecnt++;
			}
		}
		if((ie - is) * (ie - is) == onecnt) sb.append(1);
		else if(onecnt == 0) sb.append(0);
		else {
			int ihalf = (is + ie) / 2;
			int jhalf = (js + je) / 2;
			sb.append("(");
			divide(is, ihalf, js, jhalf);
			divide(is, ihalf, jhalf, je);
			divide(ihalf, ie, js, jhalf);
			divide(ihalf, ie, jhalf, je);
			sb.append(")");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new byte[n][];
		for(int i = 0; i < n; i++) map[i] = sc.next().getBytes();
		divide(0, n, 0, n);
		System.out.println(sb.toString());
	}
}
