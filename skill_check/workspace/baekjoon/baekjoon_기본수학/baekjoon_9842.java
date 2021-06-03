package baekjoon_기본수학;

import java.util.*;
public class baekjoon_9842 {
	static boolean isPrime(long l) {
		for(int i = 2; i < (int)Math.sqrt(l) + 1; i++) if(l % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(long i = 2; list.size() < n; i++) if(isPrime(i)) list.add(i);
		System.out.println(list.get(list.size() - 1));
	}
}
