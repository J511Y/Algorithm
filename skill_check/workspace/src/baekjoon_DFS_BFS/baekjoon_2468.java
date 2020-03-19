package baekjoon_DFS_BFS;
// https://www.acmicpc.net/problem/2468
// 안전 영역
// 미완성
import java.util.*;
import java.io.*;
public class baekjoon_2468 {
	static int n, max = 0;
	static int[][] map, vst;
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine());
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				max = Math.max(max, map[i][j] = Int(st.nextToken()));
			}
		}
		
	}
}
