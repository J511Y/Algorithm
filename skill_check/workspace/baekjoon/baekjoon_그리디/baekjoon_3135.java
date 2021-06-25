package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_3135 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(), c = 1000, min = Math.abs(a - b);
		for(int i = 0; i < n; i++) c = Math.min(c, Math.abs(sc.nextInt() - b) + 1);
		System.out.println(Math.min(min, c));
	}
}
