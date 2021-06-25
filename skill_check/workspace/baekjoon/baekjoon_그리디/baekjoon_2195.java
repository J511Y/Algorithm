package baekjoon_±×¸®µð;

import java.util.*;
public class baekjoon_2195 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray(), p = sc.next().toCharArray();
		int i = 0, cnt = 0, sl = s.length, pl = p.length;
		while(i < pl) {
			int max = 1;
			for(int j = 0; j < sl; j++) {
				int a = j, b = i, c = 0;
				while(a < sl && b < pl && s[a] == p[b]) {
					a++;
					b++;
					c++;
				}
				max = Math.max(max, c);
			}
			i += max;
			cnt++;
		}
		System.out.println(cnt);
	}
}
