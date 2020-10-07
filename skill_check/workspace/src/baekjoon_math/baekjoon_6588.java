package baekjoon_math;

import java.util.*;
public class baekjoon_6588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i = 3; i < 1000000; i++) {
			boolean flag = true;
			for(int j = 2; j < Math.sqrt(i) + 1; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				list.add(i);
				set.add(i);
			}
		}
		int size = list.size();
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			String str = "Goldbach's conjecture is wrong.";
			for(int i = 0; i < size; i++) {
				int a = list.get(i), b = n - a;
				if(a > (n / 2)) break;
				if(set.contains(b)) {
					str = n + " = " + a + " + " + b;
					break;
				}
			}
			System.out.println(str);
		}

	}
}
