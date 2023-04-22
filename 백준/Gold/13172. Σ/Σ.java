import java.util.*;
class Main {
	static long MOD = 1000000007;
	static long mul(long x, long y) {
		if (y == 1) return x;
		if ((y & 1) > 0) return x * mul(x, y - 1) % MOD;
		long half = mul(x, y / 2);
		return half * half % MOD;
	}
	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		long rst = 0;
		while(m-->0) {
			long n = sc.nextLong(), s = sc.nextLong(), g = gcd(n, s);
			n /= g; s /= g;
			rst = (rst + (s * mul(n, MOD - 2)) % MOD) % MOD;
		}
		System.out.print(rst);
	}
}