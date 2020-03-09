package baekjoon_sort;
// https://www.acmicpc.net/problem/11004
// K¹øÂ° ¼ö
import java.util.*;
import java.io.*;
public class baekjoon_11004 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Int(st.nextToken()), k = Int(st.nextToken());
		Integer[] arr = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Int(st.nextToken());
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
	}
}
