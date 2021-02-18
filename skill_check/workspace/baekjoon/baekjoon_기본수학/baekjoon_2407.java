package baekjoon_기본수학;
import java.math.BigInteger;
import java.util.*;
public class baekjoon_2407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		BigInteger[] f = new BigInteger[101];
		f[0] = BigInteger.ONE;
		for(int i = 1; i < 101; i++) f[i] = f[i-1].multiply(new BigInteger(i + ""));
		System.out.print(f[n].divide(f[n-m].multiply(f[m])));
	}
}
