package baekjoon_ДЉРћЧе;
import java.util.*;
public class baekjoon_6168 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min = 1 << 30;
		int[] arr = new int[n];
		arr[0] = sc.nextInt();
		for(int i = 1; i < n; i++) arr[i] = sc.nextInt() + arr[i-1];
		for(int i = 1; i < n; i++) min = Math.min(min, (arr[i] - i) + ((n - i - 1) * 2) - (arr[n-1] - arr[i-1]));
		System.out.println(arr[n-1] % n == 0 ? 0 : min);
	}
}
