package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_14659 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0, cnt = 0, maxc = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x > max) {
				max = x;
				maxc = Math.max(maxc, cnt);
				cnt = 0;
			} else cnt++;
		}
		System.out.println(Math.max(maxc, cnt));
	}
}
