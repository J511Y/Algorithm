package baekjoon_����;
import java.util.*;
public class baekjoon_2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n], cnt = new int[8001];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
			cnt[x + 4000]++;
		}
		int maxcnt = Arrays.stream(cnt).max().getAsInt(), max = -4001;
		for(int i = 0; i < 8001; i++) {
			if(cnt[i] == maxcnt) {
				if(max == -4001) max = i - 4000;
				else {
					max = i - 4000;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Math.round(Arrays.stream(arr).sum() / (double)n));
		System.out.println(arr[n/2]);
		System.out.println(max);
		System.out.println(arr[n-1] - arr[0]);
	}
}
