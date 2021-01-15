package baekjoon_two_pointer;

import java.util.*;
public class baekjoon_15565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), rst = 1 << 30;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if(m == 1) list.add(i);
		}
		int size = list.size();
		if(size < k) rst = -1;
		for(int i = 0, j = i + k - 1; j < size; i++, j++) {
			rst = Math.min(rst, list.get(j) - list.get(i) + 1);
		}
		System.out.print(rst);
	}
}
