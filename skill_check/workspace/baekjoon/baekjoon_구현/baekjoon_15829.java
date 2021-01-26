package baekjoon_±¸Çö;

import java.util.*;
public class baekjoon_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), rst = 0, r = 1, m = 1234567891;
		byte[] arr = sc.next().getBytes();
		for(int i = 0; i < n; i++) {
			rst = (rst + (arr[i] - 'a' + 1) * r) % m;
			r = (r * 31) % m;
		}
		System.out.print(rst);
	}
}
