package baekjoon_¾ÖµåÈ¤;
import java.util.*;
public class baekjoon_13116 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(), b = sc.nextInt();
			while(a != b) {
				if(a > b) a /= 2;
				else b /= 2;
			}
			System.out.println(a * 10);
		}
	}
}
