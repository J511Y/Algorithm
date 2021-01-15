package baekjoon_sort;
// https://www.acmicpc.net/problem/5766
// 할아버지는 유명해!
import java.util.*;
import java.io.*;
public class baekjoon_5766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt(), m = sc.nextInt(), sec = 0;
			if(n == 0 && m == 0) return;
			int[] arr = new int[10001];
			for(int i = 0; i < n * m; i++) arr[sc.nextInt()]++;
			int[] sort = arr.clone();
			Arrays.sort(sort);
			sec = sort[9999];
			for(int i = 0; i < 10001; i++) {
				if(arr[i] == sec) System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

class baekjoon_5766_buffer {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Int(st.nextToken()), m = Int(st.nextToken()), sec = 0;
			if(n == 0 && m == 0) {
				System.out.print(sb);
				return;
			}
			int[] arr = new int[10001];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < m; j++) {
					arr[Int(st.nextToken())]++;
				}
			}
			int[] sort = arr.clone();
			Arrays.sort(sort);
			sec = sort[9999];
			for(int i = 0; i < 10001; i++) {
				if(arr[i] == sec) sb.append(i + " ");
			}
			sb.append("\n");
		}
	}
}
