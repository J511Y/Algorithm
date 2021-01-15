package baekjoon_DP;
// https://www.acmicpc.net/problem/1010
// 다리 놓기
import java.math.BigInteger;
import java.util.*;
class baekjoon_1010{
	static BigInteger[] fact = new BigInteger[31];
	static{
		fact[0] = BigInteger.valueOf(1);
		for(int i = 1; i < 31; i++) fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
	}
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++){
			int n = sc.nextInt(), m = sc.nextInt();
			BigInteger M = fact[m].divide(fact[m-n]);
			BigInteger N = fact[n];
			System.out.println(M.divide(N));
		}
	}
}