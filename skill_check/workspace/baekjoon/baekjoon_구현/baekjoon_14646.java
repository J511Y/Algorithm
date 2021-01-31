package baekjoon_±¸Çö;

import java.util.*;
public class baekjoon_14646 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n * 2; i++) {
			int m = sc.nextInt();
			if(set.contains(m)) set.remove(m);
			else set.add(m);
			cnt = Math.max(cnt, set.size());
		}
		System.out.println(cnt);
	}
}
