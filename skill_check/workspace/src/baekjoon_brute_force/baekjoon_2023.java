package baekjoon_brute_force;

import java.util.*;
public class baekjoon_2023 {
	static boolean isPrime(int a) {
		if(a < 2) return false;
		for(int i = 2; i < (int)Math.sqrt(a) + 1; i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Queue<Integer> q = new LinkedList<>();
		q.add(2);
		q.add(3);
		q.add(5);
		q.add(7);
		while(!q.isEmpty()) {
			int a = q.poll();
			if((a + "").length() == n) System.out.println(a);
			else {
				for(int i = 1; i < 10; i++) {
					int next = a * 10 + i;
					if(isPrime(next)) q.add(next);
				}
			}
		}
	}
}
