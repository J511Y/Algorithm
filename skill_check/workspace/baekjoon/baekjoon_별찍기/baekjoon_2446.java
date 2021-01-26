package baekjoon_º°Âï±â;
// https://www.acmicpc.net/problem/2446
// º° Âï±â-9
public class baekjoon_2446 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		StringBuffer rst = new StringBuffer();
		for(int i = 1; i <= n * 2 - 1; i++) {
			int x = (i > n ? i - n : n - i) * 2 + 1;
			for(int j = 0; j < (n * 2 - x) / 2; j++) rst.append(" ");
			for(int j = 0; j < x; j++) rst.append("*");
			rst.append("\n");
		}
		System.out.print(rst.toString());
	}
}
