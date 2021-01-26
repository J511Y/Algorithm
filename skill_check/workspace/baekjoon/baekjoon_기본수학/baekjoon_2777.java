package baekjoon_기본수학;
// https://www.acmicpc.net/problem/2777
// 숫자 놀이
import java.util.*;
class baekjoon_2777 {
	static int n;
	static int dev(int x) {
		int cnt = 0;
		while(n % x == 0) {
			n /= x;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			n = sc.nextInt();
			if(n < 10) {
				System.out.println(1);
				continue;
			}
			int two = dev(2) + 2;
			int thr = dev(3) + 1;
			int oth = dev(5) + dev(7);
			int six = (two % 3 == 0 && thr % 2 == 0) ? 1 : 0;
			System.out.println(n == 1 ? ((two / 3) + (thr / 2) + oth - six) : -1);
		}
	}
}
