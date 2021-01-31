package baekjoon_백트래킹;

public class baekjoon_14650 {
	static int n, cnt = 0;
	static void bt(int c, int v) {
		if(c == n) cnt += v % 3 == 0 ? 1 : 0;
		else {
			if(v != 0) bt(c + 1, v * 10 + 0);
			bt(c + 1, v * 10 + 1);
			bt(c + 1, v * 10 + 2);
		}
	}
	public static void main(String[] args) {
		n = new java.util.Scanner(System.in).nextInt();
		bt(0, 0);
		System.out.print(cnt);
	}
}
