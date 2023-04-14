import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long l = 1, r = k;
		while(l < r) {
			long mid = (l + r) / 2, cnt = 0;
			for(int i = 1; i <= n; i++) cnt += Math.min(mid / i, n);
			if (cnt >= k) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		System.out.print(l);
	}
}