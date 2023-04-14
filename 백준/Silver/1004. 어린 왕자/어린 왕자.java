import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int s1 = sc.nextInt(), e1 = sc.nextInt(), s2 = sc.nextInt(), e2 = sc.nextInt(), n = sc.nextInt(), cnt = 0;
			while(n-->0) {
				int c1 = sc.nextInt(), c2 = sc.nextInt(), r = sc.nextInt();
				boolean start = inner(s1, e1, c1, c2, r), end = inner(s2, e2, c1, c2, r);
				if (start ^ end) cnt++;
			}
			System.out.println(cnt);
		}
	}
	static boolean inner(int x1, int y1, int x2, int y2, int r) { return Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) < Math.pow(r, 2); }
}