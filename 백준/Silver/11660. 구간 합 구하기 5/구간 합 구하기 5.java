import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] sum = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) for(int j = 1; j <= n; j++) sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + sc.nextInt();
		while(m-->0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			sb.append(sum[c][d] - sum[c][b-1] - sum[a-1][d] + sum[a-1][b-1]).append("\n");
		}
		System.out.print(sb);
	}
}