package baekjoon_±âº»;
// https://www.acmicpc.net/problem/1568
// »õ
public class baekjoon_1568 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt(), cnt = 0, i = 1;
		while(n > 0) {
			if(i > n) i = 1;
			else {
				n -= i++;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
