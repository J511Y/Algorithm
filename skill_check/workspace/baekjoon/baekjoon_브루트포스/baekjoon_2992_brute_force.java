package baekjoon_브루트포스;
// https://www.acmicpc.net/problem/2992
// 크면서 작은 수
// 완전탐색 방법
public class baekjoon_2992_brute_force {
	static String s;
	static int len, x, min = Integer.MAX_VALUE;
	static void func(int cnt, int num, int bit) {
		if(cnt == len && num > x) min = Math.min(num, min);
		else if(cnt < len){
			for(int i = 0; i < len ;i++) {
				if((bit & (1 << i)) == 0) {
					func(cnt + 1, num * 10 + (s.charAt(i) - '0'), bit | (1 << i));					
				}
			}
		}
	}
	public static void main(String[] args) {
		x = new java.util.Scanner(System.in).nextInt();
		s = x + "";
		len = s.length();
		func(0, 0, 0);
		System.out.println(min == Integer.MAX_VALUE ? 0 : min);
	}
}
