package baekjoon_binary_search;
// https://www.acmicpc.net/problem/16065
// Down the Pyramid
import java.util.*;
import java.io.*;
public class baekjoon_16065 {
	static int Int(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Int(st.nextToken());
		int left = 0, right = arr[0];
		while(left <= right) {
			int mid = (left + right) / 2, tmp = mid;
			boolean success = true;
			for(int i = 0; i < n; i++) {
				tmp = arr[i] - tmp;
				if(tmp < 0) {
					success = false;
					break;
				}
			}
			if(success) right = mid - 1;
			else left = mid + 1;
		}
		for(int i = 0; i < n; i++) arr[i] = left = arr[i] - left;
		int min = 1 << 30;
		for(int i = 0; i < n; i += 2) min = Math.min(min, arr[i] + 1);
		System.out.print(min < 0 ? 0 : min);
	}
}
