package baekjoon_그리디;
// https://www.acmicpc.net/problem/1564
// 팩토리얼 5
public class baekjoon_1564 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		long fact = 1;
		for(int i = 2; i <= n; i++) {
			fact *= i;
			int j = 1;
			while(i % (j *= 5) == 0) fact /= 10;
			fact %= 1000000000000l;
		}
		System.out.println(String.format("%05d", (fact % 100000)));
	}
}
