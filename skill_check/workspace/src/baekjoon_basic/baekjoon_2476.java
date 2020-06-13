package baekjoon_basic;
// https://www.acmicpc.net/problem/2476
// 주사위 게임
import java.util.*;
public class baekjoon_2476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a == b && b == c) {
				max = Math.max(max, 10000 + 1000 * a);
			}else {
				if(a == b || b == c) max = Math.max(max, 1000 + 100 * b);
				else if(a == c) max = Math.max(max, 1000 + 100 * a);
				else max = Math.max(max, 100 * Math.max(a, Math.max(b, c)));
			}
		}
		System.out.print(max);
	}
}
