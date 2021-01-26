package baekjoon_æ÷µÂ»§;
import java.util.*;
public class baekjoon_20309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), flag = 0;
		for(int i = 0; i < n; i++) flag += sc.nextInt() % 2 == i % 2 ? 1 : 0;
		System.out.println(flag > 0 ? "NO" : "YES");
	}
}
