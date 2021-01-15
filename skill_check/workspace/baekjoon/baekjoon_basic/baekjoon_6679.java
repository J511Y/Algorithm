package baekjoon_basic;
// https://www.acmicpc.net/problem/6679
// 싱기한 네 자리 숫자
public class baekjoon_6679 {
	static int change(int i, int x) {
		int sum = 0;
		while(i > x) {
			sum += i % x;
			i /= x;
		}
		return sum + i;
	}
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for(int i = 2992; i <= 9999; i++) {
			int a = change(i, 10);
			int b = change(i, 12);
			int c = change(i, 16);
			if(a == b && b == c) sb.append(i + "\n");
		}
		System.out.print(sb.toString());
	}
}
