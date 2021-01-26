package baekjoon_¹éÆ®·¡Å·;
// https://www.acmicpc.net/problem/1248
// ¸ÂÃçºÁ
import java.util.*;
public class baekjoon_1248 {
	static int n, flag = 0;
	static String s;
	static void BackTracking(int a, int b, int c, int d) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 4; i++) {
			sb.append(getChar(a));
			for(int j = i + 1; j < 4; j++) {
				
			}
		}
	}
	static char getChar(int i) {
		return i < 0 ? '-' : i == 0 ? '0' : '+';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next();
		int[] arr = {-10, -9, -8, -7};
		
		BackTracking(-10, -9, -8, -7);
	}
}
