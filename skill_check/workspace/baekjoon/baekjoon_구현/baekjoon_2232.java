package baekjoon_±¸Çö;
// https://www.acmicpc.net/problem/2232
// Áö·Ú
import java.util.*;
public class baekjoon_2232 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if((i == 0 || arr[i - 1] <= arr[i]) && (i == n - 1 || arr[i + 1] <= arr[i])) {
				System.out.println(i + 1);
			}
		}
	}
}
