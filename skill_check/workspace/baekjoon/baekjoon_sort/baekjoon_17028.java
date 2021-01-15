package baekjoon_sort;
// https://www.acmicpc.net/problem/17028
// Sleepy Cow Sorting
import java.util.*;
public class baekjoon_17028 {
	static boolean isSorted(int[] arr, int idx) {
		for(int i = idx + 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++, cnt++) {
			if(isSorted(arr, i)) break;
		}
		System.out.print(cnt);
	}
}
