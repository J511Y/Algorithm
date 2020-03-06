package baekjoon_basic;
// https://www.acmicpc.net/problem/3460
// 이진수
// 비트마스크, 이진법 기본
import java.util.*;
public class baekjoon_3460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < tc; i++) {
			String s = Integer.toBinaryString(sc.nextInt());
			int len = s.length();
			for(int j = len - 1; j >= 0; j--) {
				if(s.charAt(j) == '1') sb.append((len - j - 1) + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
