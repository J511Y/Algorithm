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
		int n = Int(br.readLine()), min = 1 << 30;
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Int(st.nextToken());
		for(int i = n - 1; i >= 0; i--) arr[i] -= arr[i+1];
		for(int i = 0; i <= n; i += 2) min = Math.min(min, arr[i]);
		for(int i = 0; i <= n; i++) arr[i] += min * (i % 2 == 0 ? -1 : 1);
		min = 1 << 30;
		for(int i = 1; i <= n; i += 2) min = Math.min(min, arr[i] + 1);
		System.out.println(min < 0 ? 0 : min);
	}
}
