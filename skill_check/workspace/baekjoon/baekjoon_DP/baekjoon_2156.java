package baekjoon_DP;
import java.util.*;
public class baekjoon_2156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] wine = new int[n + 1], d = new int[n+1];
		for(int i = 1; i <= n; i++) wine[i] = sc.nextInt();
		if(n < 3) {
			System.out.println(Arrays.stream(wine).sum());
			return;
		}
		d[1] = wine[1]; d[2] = wine[2] + wine[1];
		for(int i = 3; i <= n; i++) {
			int a = d[i-3] + wine[i-1] + wine[i];
			int b = d[i-2] + wine[i];
			int c = d[i-1];
			d[i] = Math.max(a, Math.max(b, c));
		}
		System.out.println(d[n]);
	}
}
