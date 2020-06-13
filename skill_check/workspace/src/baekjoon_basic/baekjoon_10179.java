package baekjoon_basic;
// https://www.acmicpc.net/problem/10179
// ÄíÆù
import java.util.*;
public class baekjoon_10179 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) System.out.println("$" + String.format("%.2f", sc.nextDouble() * 0.8));
	}
}
