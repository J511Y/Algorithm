package baekjoon_�⺻;
// https://www.acmicpc.net/problem/5585
// �Ž�����
public class baekjoon_5585 {
	public static void main(String[] args) {
		int n = 1000 - new java.util.Scanner(System.in).nextInt(), cnt = 0, c = 500;
		while(n > 0) {
			cnt += n / c;
			n -= n / c * c;
			c /= c > n && c > 1 && (c+"").startsWith("5") ? 5 : 2;  
		}
		System.out.println(cnt);
	}
}
