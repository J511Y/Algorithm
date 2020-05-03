package baekjoon_string;
// https://www.acmicpc.net/problem/1259
// ÆÓ¸°µå·Ò¼ö
import java.util.*;
public class baekjoon_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		while(!(s = sc.next()).equals("0")) {
			if(s.equals(new StringBuffer(s).reverse().toString())) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
