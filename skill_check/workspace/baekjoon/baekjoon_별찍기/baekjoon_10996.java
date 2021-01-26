package baekjoon_º°Âï±â;
// https://www.acmicpc.net/problem/10996
// º° Âï±â - 21
public class baekjoon_10996 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n * 2; i++) {
			for(int j = 0; j < n; j++) sb.append((i + j) % 2 == 0 ? '*' : ' ');
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
