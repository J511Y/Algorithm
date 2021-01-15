package baekjoon_math2;
public class baekjoon_1676 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int f = 0;
		while(n > 0) {
			f += n / 5;
			n /= 5;
		}
		System.out.println(f);
	}
}