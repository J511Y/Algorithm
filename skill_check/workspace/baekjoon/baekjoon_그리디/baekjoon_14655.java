package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_14655 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p = 0, m = 0;
		for(int i = 0; i < n; i++) p += Math.abs(sc.nextInt());
		for(int i = 0; i < n; i++) m -= Math.abs(sc.nextInt());
		System.out.print(p - m);
	}
}
