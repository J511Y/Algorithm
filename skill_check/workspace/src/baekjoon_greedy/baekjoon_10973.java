package baekjoon_greedy;
//https://www.acmicpc.net/problem/10973
//이전 순열
import java.util.*;
public class baekjoon_10973 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), idx = n - 2;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int min = arr[n-1];
		while(idx >= 0) {
			if(arr[idx] > min) break;
			min = Math.min(min, arr[idx]);
			idx--;
		}
		if(idx == -1) System.out.print(-1);
		else {
			int maxidx = idx + 1;
			for(int i = idx + 1; i < n; i++) maxidx = arr[maxidx] < arr[i] && arr[i] < arr[idx] ? i : maxidx;
			int tmp = arr[idx];
			arr[idx] = arr[maxidx];
			arr[maxidx] = tmp;
			Arrays.sort(arr, idx + 1, n);
			for(int i = 0, j = n - 1; i < n; i++) System.out.print((i <= idx ? arr[i] : arr[j--]) + " ");
		}
	}
}