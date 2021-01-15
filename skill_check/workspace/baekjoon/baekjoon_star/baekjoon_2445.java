package baekjoon_star;
// https://www.acmicpc.net/problem/2445
// º° Âï±â-8
public class baekjoon_2445 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		StringBuffer rst = new StringBuffer();
		for(int i = 1; i <= n*2-1; i++) {
			StringBuffer sb = new StringBuffer();
			for(int j = 1; j <= (i > n ? n * 2 - i : i); j++) sb.append("*");
			for(int j = (i > n ? n * 2 - i: i); j < n; j++) sb.append(" ");
			rst.append(sb).append(sb.reverse()).append("\n");
		}
		System.out.print(rst.toString());
	}
}
