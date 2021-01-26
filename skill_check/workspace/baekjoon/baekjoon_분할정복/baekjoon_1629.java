package baekjoon_ºÐÇÒÁ¤º¹;
// https://www.acmicpc.net/problem/1629
// °ö¼À
import java.util.*;
public class baekjoon_1629 {
	static long divide(long a, long b, long c) {
		if(b == 1) return a;
		long tmp = divide(a, b / 2, c);
		if(b % 2 == 0) return (tmp * tmp) % c;
		else return (((tmp * tmp) % c) * a) % c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		System.out.println(divide(a % c, b, c));
		System.out.println(Integer.MAX_VALUE);
	}
}
