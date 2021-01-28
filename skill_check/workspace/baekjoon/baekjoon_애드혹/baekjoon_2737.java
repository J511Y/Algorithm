package baekjoon_¾ÖµåÈ¤;

import java.util.*;
public class baekjoon_2737 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt() - 1, cnt = 0;
			for(int i = 2; (n -= i) >= 0; i++) cnt += n % i == 0 ? 1 : 0;
			System.out.println(cnt);
		}
	}
}
