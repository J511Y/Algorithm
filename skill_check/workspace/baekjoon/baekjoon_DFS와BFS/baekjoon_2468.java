package baekjoon_DFS와BFS;
// https://www.acmicpc.net/problem/2468
// 안전 영역
// 2020.03.22 23.33 완성
import java.util.*;
import java.io.*;
public class baekjoon_2468 {
	static int n, max = 0, rst = 0;
	static int[][] map, vst, WH = new int[][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int Int(String s) {return Integer.parseInt(s);}
	static void BFS(int x) {
		vst = new int[n][n];
		int cnt = 0;
		Queue<int[]> q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(vst[i][j] == 0 && map[i][j] > x) {
					q.add(new int[] {i, j});
					vst[i][j] = 1;
					cnt++;
				}
				while(!q.isEmpty()) {
					int[] arr = q.poll();
					int a = arr[0], b = arr[1];
					for(int k = 0; k < 4; k++) {
						int A = a + WH[0][k];
						int B = b + WH[1][k];
						if(0 <= A && 0 <= B && A < n && B < n && vst[A][B] == 0 && map[A][B] > x) {
							q.add(new int[] {A, B});
							vst[A][B] = 1;
						}
					}
				}
			}
		}
		rst = Math.max(rst, cnt);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Int(br.readLine());
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				max = Math.max(max, map[i][j] = Int(st.nextToken()));
			}
		}
		
		for(int i = 0; i < max; i++) BFS(i);
		System.out.println(rst);
	}
}
