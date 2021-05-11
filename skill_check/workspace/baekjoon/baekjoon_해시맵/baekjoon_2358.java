package baekjoon_ÇØ½Ã¸Ê;

import java.util.*;
public class baekjoon_2358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		Map<Integer, Integer> x = new HashMap<>(), y = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			x.put(a, x.getOrDefault(a, 0) + 1);
			y.put(b, y.getOrDefault(b, 0) + 1);
		}
		sum += (int)x.values().stream().filter(a -> a > 1).count();
		sum += (int)y.values().stream().filter(a -> a > 1).count();
		System.out.print(sum);
	}
}
