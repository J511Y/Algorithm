package baekjoon_greedy;
// https://www.acmicpc.net/problem/1459
// °È±â
import java.util.*;
public class baekjoon_1459 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), s = sc.nextInt(), dis = 0, min = Math.min(x, y), max = Math.max(x, y);
		if(w * 2 < s) dis += (x * w) + (y * w);
		else {
			dis += (min * s);
			max -= min;
			if(s * 2 < w) dis += (max / 2 * 2) * s + (max % 2 == 1 ? w : 0);
			else dis += max * w;
		}
		System.out.print(dis);
	}
}
