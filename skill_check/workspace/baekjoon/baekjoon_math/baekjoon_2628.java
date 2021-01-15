package baekjoon_math;
// https://www.acmicpc.net/problem/2628
// 종이자르기
import java.util.*;
public class baekjoon_2628 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		List<Integer> width = new ArrayList<>(), height = new ArrayList<>();
		for(int i = 0; i < k; i++) (sc.nextInt() == 0 ? height : width).add(sc.nextInt());
		width.sort(null);
		height.sort(null);
		int w = width.size() == 0 ? n : n - width.get(width.size() - 1), h = height.size() == 0 ? m : m - height.get(height.size() - 1), last = 0;
		for(int i = 0; i < width.size(); i++) {
			w = Math.max(w, width.get(i) - last);
			last = width.get(i);
		}
		last = 0;
		for(int i = 0; i < height.size(); i++) {
			h = Math.max(h, height.get(i) - last);
			last = height.get(i);
		}
		System.out.println(w * h);
	}
}
