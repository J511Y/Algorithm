package baekjoon_simulation;
// https://www.acmicpc.net/problem/5549
// Çà¼º Å½»ç
import java.util.*;
import java.io.*;
public class baekjoon_5549 {
	static int Int(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Int(st.nextToken()), m = Int(st.nextToken()), k = Int(br.readLine());
		char[][] map = new char[n][m];
		int[][] J = new int[1000][1000], O = new int[1000][1000], I = new int[1000][1000];
		for(int i = 0; i < n; i++) {
			char[] arr = br.readLine().toCharArray();
			map[i] = arr;
			J[i][0] = arr[0] == 'J' ? 1 : 0;
			O[i][0] = arr[0] == 'O' ? 1 : 0;
			I[i][0] = arr[0] == 'I' ? 1 : 0;
			for(int j = 1; j < m; j++) {
				J[i][j] = J[i][j-1] + (arr[j] == 'J' ? 1 : 0);
				O[i][j] = O[i][j-1] + (arr[j] == 'O' ? 1 : 0);
				I[i][j] = I[i][j-1] + (arr[j] == 'I' ? 1 : 0);
			}
		}
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Int(st.nextToken()) - 1, b = Int(st.nextToken()) - 1, c = Int(st.nextToken()) - 1, d = Int(st.nextToken()) - 1;
			int[] rst = new int[3];
			for(int j = a; j <= c; j++) {
				rst[0] += J[j][d] - J[j][b] + (map[j][b] == 'J' ? 1 : 0);
				rst[1] += O[j][d] - O[j][b] + (map[j][b] == 'O' ? 1 : 0);
				rst[2] += I[j][d] - I[j][b] + (map[j][b] == 'I' ? 1 : 0);
			}
			for(int x : rst) sb.append(x + " ");
			sb.setCharAt(sb.length() - 1, '\n');
		}
		System.out.print(sb);
	}
}
