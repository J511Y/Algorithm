package baekjoon_기본수학;
import java.util.*;
public class baekjoon_2485 {
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int gcd = arr[1] - arr[0];
		for(int i = 1; i < n; i++) gcd = gcd(gcd, arr[i] - arr[i-1]);
		System.out.print((arr[n-1] - arr[0]) / gcd - (n - 1));
	}
}
