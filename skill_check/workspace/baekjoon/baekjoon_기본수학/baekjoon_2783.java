package baekjoon_±âº»¼öÇÐ;
// https://www.acmicpc.net/problem/2783
// »ï°¢ ±è¹ä
import java.util.*;
public class baekjoon_2783 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = sc.nextInt() * (1000d / sc.nextInt());
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) min = Math.min(min, sc.nextInt() * (1000d / sc.nextInt()));
		System.out.println(String.format("%.2f", min));
	}
}
