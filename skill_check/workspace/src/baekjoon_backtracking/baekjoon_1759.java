package baekjoon_backtracking;
// https://www.acmicpc.net/problem/1759
// 암호 만들기
/*
 * 문제 풀기 전 생각 2020.03.30 21:12
 * --------------------------
 * 모음 자음 상태값 전달하면서 백트래킹하면 될 듯
 */
import java.util.*;
public class baekjoon_1759 {
	static int L, M;
	static String[] chars;
	static StringBuffer sb = new StringBuffer();
	static int isV(String s) {
		return (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) ? 1 : 0;
	}
	static void BT(int depth, String s, int c, int v, int idx) {
		if(depth == L) {
			if(c > 1 && v > 0) {
				sb.append(s + "\n");
			}
		}else {
			for(; idx < M; idx++) {
				String S = chars[idx];
				BT(depth + 1, s + S, c + (isV(S) == 0 ? 1 : 0), v + isV(S), idx + 1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt(); M = sc.nextInt();
		chars = new String[M];
		for(int i = 0; i < M; i++) chars[i] = sc.next();
		Arrays.sort(chars);
		BT(0, "", 0, 0, 0);
		System.out.println(sb.toString());
	}
}
