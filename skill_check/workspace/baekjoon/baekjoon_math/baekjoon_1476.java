package baekjoon_math;
// https://www.acmicpc.net/problem/1476
// 날짜 계산
import java.util.*;
public class baekjoon_1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt() - 1, s = sc.nextInt() - 1, m = sc.nextInt() - 1, y = 0;
		while(true) {
			int a = y % 15, b = y % 28, c = y % 19;
			if(a == e && b == s && c == m) break;
			y++;
		}
		System.out.println(y + 1);
	}
}
