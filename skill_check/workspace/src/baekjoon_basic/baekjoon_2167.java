package baekjoon_basic;
// https://www.acmicpc.net/problem/2167
// 2차원 배열의 합
import java.util.*;
import java.io.*;
public class baekjoon_2167 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Int(st.nextToken()), m = Int(st.nextToken());
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) arr[i][j] = Int(st.nextToken());
		}
		n = Int(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Int(st.nextToken())-1, y = Int(st.nextToken())-1, a = Int(st.nextToken())-1, b = Int(st.nextToken())-1, sum = 0;
			for(;x <= a; x++) {
				for(int z = y; z <= b; z++) sum += arr[x][z];
			}
			System.out.println(sum);
		}
	}
}
