package baekjoon_two_pointer;

import java.util.*;
public class baekjoon_1644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0, l = 0, r = 0, sum = 2;
		boolean[] prime = new boolean[5000001];
		Arrays.fill(prime, true);
		List<Integer> list = new ArrayList<>();
		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) {
				list.add(i);
				for(int j = i * 2; j < prime.length; j += i) prime[j] = false;
			}
		}
		while(l <= r) {
			if(sum <= n) {
				if(sum == n) cnt++;
				r++;
				sum += list.get(r);
			} else {
				sum -= list.get(l);
				l++;
			}
		}
		System.out.println(cnt);
	}
}
