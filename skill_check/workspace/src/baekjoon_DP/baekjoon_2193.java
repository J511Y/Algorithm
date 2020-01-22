package baekjoon_DP;
import java.util.*;
public class baekjoon_2193 {
	public static void main(String[] args) {
		long n = new Scanner(System.in).nextInt(), a = 1, b = 1;
		for(int i = 3; i <= n; i++) {
			long tmp = b;
			b += a;
			a = tmp;
		}
		System.out.println(b);
	}
}
