package baekjoon_recursion;

import java.util.*;
public class baekjoon_1527 {
	static List<Integer> nums = new ArrayList<>();
	static void makeNum(int num) {
		nums.add(num);
		if(num > Integer.MAX_VALUE / 5) return;
		makeNum(num * 10 + 4);
		makeNum(num * 10 + 7);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;
		makeNum(0);
		for(int i : nums) cnt += a <= i && i <= b ? 1 : 0;
		System.out.print(cnt);
	}
}
