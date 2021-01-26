package baekjoon_정렬;
// https://www.acmicpc.net/problem/1026
// 보물
import java.util.*;
public class baekjoon_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		int[] a = new int[n], b = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) b[i] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i< n; i++) sum += a[i] * b[n - i - 1];
		System.out.println(sum);
	}
}
