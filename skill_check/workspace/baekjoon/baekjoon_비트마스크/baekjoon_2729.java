package baekjoon_비트마스크;

import java.math.BigInteger;
import java.util.*;
public class baekjoon_2729 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			BigInteger a = new BigInteger(sc.next(), 2), b = new BigInteger(sc.next(), 2);
			System.out.println(a.add(b).toString(2));
		}
	}
}
