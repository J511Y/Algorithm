import java.util.*;

class Main {
	static int[][] dp = new int[64][64];
	static long Long(String str) {return Long.parseLong(str);}
	static void func() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(Long.highestOneBit(n));
	}
}