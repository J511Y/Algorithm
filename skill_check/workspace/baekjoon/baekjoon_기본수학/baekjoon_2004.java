package baekjoon_기본수학;
// https://www.acmicpc.net/problem/2004
// 조합 0의 개수
import java.util.*;
public class baekjoon_2004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0, f = 0, n = sc.nextInt(), m = sc.nextInt();
		for(long i = 2; i <= n; i *= 2) t += (n / i) - (m / i) - ((n - m) / i); 
		for(long i = 5; i <= n; i *= 5) f += (n / i) - (m / i) - ((n - m) / i);
		System.out.println(Math.min(t, f));
	}
}
