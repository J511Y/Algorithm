package baekjoon_basic;
// https://www.acmicpc.net/problem/6378
// µðÁöÅÐ ·çÆ®
import java.util.*;
public class baekjoon_6378 {
	static int dr(String s) {
		int sum = 0;
		for(byte b : s.getBytes()) sum += b - '0';
		return dr(sum);
	}
	static int dr(int x) {
		int sum = 0;
		while(x > 0) {
			sum += x % 10;
			x /= 10;
		}
		if(sum > 9) sum = dr(sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(!(s = sc.next()).equals("0")) {
			System.out.println(dr(s));
		}
	}
}
