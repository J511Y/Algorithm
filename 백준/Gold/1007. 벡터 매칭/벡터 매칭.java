import java.util.*;
class Main {
	static int n;
	static int[] x, y;
	static double min;
	static void combination(int bit, int idx) {
		if (idx == n) {
			if (Integer.bitCount(bit) == n / 2) {
				int a = 0, b = 0;
				for(int i = 0; i < n; i++) {
					int mul = (bit & (1 << i)) > 0 ? 1 : -1;
					a += x[i] * mul;
					b += y[i] * mul;
				}
				min = Math.min(min, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
			}
		} else {
			for(int i = idx; i < n; i++) {
				combination(bit | (1 << i), i + 1);
			}
		}
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(tc-->0) {
			n = sc.nextInt();
			min = 1 << 30;
			x = new int[n];
			y = new int[n];
			for(int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			combination(0, 0);
			sb.append(min + "\n");
		}
		System.out.print(sb);
	}
}