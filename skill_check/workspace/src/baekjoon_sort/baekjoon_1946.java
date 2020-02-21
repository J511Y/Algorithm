package baekjoon_sort;
import java.util.*;
import java.io.*;
public class baekjoon_1946 {
	static int Int(String s) { 
		return Integer.parseInt(s); 
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Int(br.readLine());
		for(int t = 0; t < tc; t++) {
			int n = Int(br.readLine());
			int[] arr = new int[n + 1];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[Int(st.nextToken())] = Int(st.nextToken());
			}
			int max = arr[1];
			int cnt = 1;
			for(int i = 2; i <= n; i++) {
				if(arr[i] < max) {
					max = arr[i];
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}