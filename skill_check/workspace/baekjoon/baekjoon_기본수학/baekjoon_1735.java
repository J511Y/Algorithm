package baekjoon_�⺻����;
// https://www.acmicpc.net/problem/1735
// �м� ��
import java.util.*;
public class baekjoon_1735 {
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int ja = a * d + b * c, mo = b * d, gcd = gcd(mo, ja);
		System.out.print((ja / gcd) + " " + (mo / gcd));
	}
}
