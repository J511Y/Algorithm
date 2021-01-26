package baekjoon_º°Âï±â;
// https://www.acmicpc.net/problem/2522
// º° Âï±â-12
public class baekjoon_2522 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= n * 2 - 1; i++) {
			for(int j = 0; j < n; j++) sb.append(i > n ? (j < i - n ? " " : "*") : (i + j < n ? " " : "*"));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
