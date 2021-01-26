package baekjoon_±âº»;
// https://www.acmicpc.net/problem/1357
// µÚÁýÈù µ¡¼À
import java.util.*;
public class baekjoon_1357 {
	static int Rev(String a) {
		return Integer.parseInt(new StringBuffer(a).reverse().toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		System.out.println(Rev(Rev(a) + Rev(b) + ""));
	}
}
