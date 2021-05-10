package baekjoon_¼öÇÐ2;

public class baekjoon_11444 {
	static int mod = 1000000007;
	static long[][] fibo(long l) {
		if(l == 1) return new long[][] {{1, 1}, {1, 0}};
		else {
			long[][] arr = fibo(l / 2);
			arr = mult(arr, arr);
	        if(l % 2 == 1) return mult(arr, fibo(1));
	        return arr;
		}
	}
	static long[][] mult(long[][] a, long[][] b) {
		long[][] c = new long[2][2];
		c[0][0] = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % mod;
		c[0][1] = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % mod;
		c[1][0] = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % mod;
		c[1][1] = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % mod;
		return c;
	}
	public static void main(String[] args) {
		System.out.print(fibo(new java.util.Scanner(System.in).nextLong())[0][1]);
	}
}
