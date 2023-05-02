import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
		int[] sum = new int[n + 1];
		for(int i = 1; i <= n; i++) sum[i] = sum[i - 1] + sc.nextInt();
		if (sum[n] < s) System.out.print(0);
		else {
			int l = 0, r = 1, min = n;
			while(r <= n && l < r) {
				if (sum[r] - sum[l] >= s) {
					min = Math.min(min, r - l);
					l++;
				} else r++;
			}
			System.out.print(min);
		}
	}
}