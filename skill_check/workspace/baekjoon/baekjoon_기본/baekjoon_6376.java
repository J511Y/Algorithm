package baekjoon_기본;
// https://www.acmicpc.net/problem/6376
// e 계산
public class baekjoon_6376 {
	public static void main(String[] args) {
		double d = 2.5, f = 2;
		System.out.println("n e\n- -----------\n0 1\n1 2\n2 2.5");
		for(int i = 3; i < 10; i++) {
			f *= i;
			d += 1 / f;
			System.out.println(String.format("%d %.9f", i, d));
		}
	}
}
