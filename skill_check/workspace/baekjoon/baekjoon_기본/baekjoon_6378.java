package baekjoon_�⺻;
// https://www.acmicpc.net/problem/6378
// ������ ��Ʈ
import java.util.*;
public class baekjoon_6378 {
	static int dr(String s) {
		int sum = 0;
		for(byte b : s.getBytes()) sum += b - '0';
		return sum > 9 ? dr(sum + "") : sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(!(s = sc.next()).equals("0")) {
			System.out.println(dr(s));
		}
	}
}
