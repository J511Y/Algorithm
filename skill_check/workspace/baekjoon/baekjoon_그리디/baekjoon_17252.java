package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_17252 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		long t = 20, n = sc.nextLong();
		if(n == 0) {
			System.out.println("NO");
			return;
		}
		while(t >= 0 && n > 0) {
			long m = (long)Math.pow(3, t);
			if(n >= m) n -= m;
			t--;
		}
		System.out.print(n == 0 ? "YES" : "NO");
	}
}
