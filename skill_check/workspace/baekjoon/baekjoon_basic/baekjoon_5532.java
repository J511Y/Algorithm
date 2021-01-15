package baekjoon_basic;
// https://www.acmicpc.net/problem/5532
// ¹æÇÐ ¼÷Á¦
import java.util.*;
public class baekjoon_5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int max = Math.max((int)Math.ceil(a/(double)c), (int)Math.ceil(b/(double)d));
		System.out.print(l - max);
	}
}
