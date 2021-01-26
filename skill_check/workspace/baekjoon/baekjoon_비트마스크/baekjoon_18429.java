package baekjoon_비트마스크;
import java.util.*;
class baekjoon_18429 {
	static int[] arr;
	static int n, k, cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		dfs(500, 0);
		System.out.println(cnt);
	}
	static void dfs(int w, int bit) {
		if(Integer.bitCount(bit) == n) cnt++;
		else {
			for(int i = 0; i < n; i++) {
				int nw = w - k + arr[i], nb = 1 << (i + 1);
				if(nw > 499 && (bit & nb) == 0) dfs(nw, bit | nb);
			}
		}
	}
}