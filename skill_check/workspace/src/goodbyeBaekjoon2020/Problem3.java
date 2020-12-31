package goodbyeBaekjoon2020;

import java.util.*;
import java.io.*;
public class Problem3 {
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, q, tc;
	static List<Integer>[] list;
	static int Int(String s) {return Integer.parseInt(s);}
	static int[] uf1, uf2, vst;
	public static void main(String[] args) throws Exception {
		n = Int(br.readLine());
		q = Int(br.readLine());
		uf1 = new int[n + 1];
		uf2 = new int[n + 1];
		vst = new int[n + 1];
		list = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) list[i] = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			uf1[i] = uf2[i] = i; 
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Int(st.nextToken()), b = Int(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1);
	}
	static int dfs(int x) {
		vst[x] = 1;
		for(int i : list[x]) {
			if(vst[i] == 1) {
				return uf1[i] = x;
			} else {
				
			}
		}
		return uf1[x] = x;
	}
}
