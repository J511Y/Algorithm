package baekjoon_backtracking;
// https://www.acmicpc.net/problem/12101
// 1, 2, 3 ¥ı«œ±‚ 2
import java.util.*;
public class baekjoon_12101 {
	static int n, k;
	static List<String> list = new ArrayList<>();
	static void func(int sum, String s) {
		if(sum == n) list.add(s);
		for(int i = 1; i < 4 && sum + i <= n; i++) func(sum + i, s + "+" + i);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); k = sc.nextInt();
		func(0, "");
		list.sort(null);
		System.out.println(list.size() < k ? -1 : list.get(k-1).substring(1));
	}
}
