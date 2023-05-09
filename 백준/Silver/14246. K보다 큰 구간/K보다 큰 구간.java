import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), l = 0, r = 1;
		long[] arr = new long[n + 1];
		for(int i = 1; i <= n; i++) arr[i] = sc.nextLong() + arr[i - 1];
		long k = sc.nextLong(), cnt = 0;
		while(r <= n) {
			long sum = arr[r] - arr[l];
			if (sum > k) {
				cnt += n - r + 1;
				l++;
			} else r++;
		}
		System.out.print(cnt);
	}
}