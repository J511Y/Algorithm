package baekjoon_±¸Çö;

import java.util.*;
public class baekjoon_2721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int n = sc.nextInt();
			long ans = 0;
			for(int i = 1; i <= n; i++) ans += i * ((i + 1) * (i + 2) / 2);
			System.out.println(ans);
		}
	}
}
