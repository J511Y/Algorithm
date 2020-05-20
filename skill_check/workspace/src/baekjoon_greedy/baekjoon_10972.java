package baekjoon_greedy;
// https://www.acmicpc.net/problem/10972
// 다음 순열
import java.util.*;
public class baekjoon_10972 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), idx = n - 2;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int max = arr[n-1];
		while(idx >= 0) {
			if(arr[idx] < max) break;
			max = Math.max(max, arr[idx]);
			idx--;
		}
		if(idx == -1) System.out.print(-1);
		else {
			int minidx = idx + 1;
			for(int i = idx + 1; i < n; i++) minidx = arr[minidx] > arr[i] && arr[i] > arr[idx] ? i : minidx;
			int tmp = arr[idx];
			arr[idx] = arr[minidx];
			arr[minidx] = tmp;
			Arrays.sort(arr, idx + 1, n);
			for(int i : arr) System.out.print(i + " ");
		}
	}
}
