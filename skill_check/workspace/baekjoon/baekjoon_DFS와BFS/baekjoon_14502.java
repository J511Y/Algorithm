package baekjoon_DFS와BFS;
// https://www.acmicpc.net/problem/14502
// 연구소
import java.util.*;
import java.io.*;
class baekjoon_14502 {
	static int n, m, size, max = 0;
	static int[][] map, vst, WH = new int[][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static List<int[]> empty = new ArrayList<>(), virus = new ArrayList<>();
	static void BFS() {
		int cnt = 0;
		Queue<int[]> q = new LinkedList<>();
		vst = new int[n][m];
		for(int[] arr : virus) {
			q.add(arr);
			vst[arr[0]][arr[1]] = 1;
		}
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int x = poll[0], y = poll[1];
			for(int i = 0; i < 4; i++) {
				int X = x + WH[0][i];
				int Y = y + WH[1][i];
				if(0 <= X && 0 <= Y && X < n && Y < m && vst[X][Y] == 0 && map[X][Y] == 0) {
					q.add(new int[] {X, Y});
					cnt++;
					vst[X][Y] = 1;
				}
			}
		}
		max = Math.max(max, size - cnt - 3);
	}
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Int(st.nextToken()); m = Int(st.nextToken());
		map = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int x = Int(st.nextToken());
				if(x == 0) empty.add(new int[] {i, j});
				if(x == 2) virus.add(new int[] {i, j});
				map[i][j] = x;
			}
		}
		size = empty.size();
		for(int i = 0; i < size - 2; i++) {
			int[] iArr = empty.get(i);
			for(int j = i + 1; j < size - 1; j++) {
				int[] jArr = empty.get(j);
				for(int k = j + 1; k < size; k++) {
					int[] kArr = empty.get(k);
					map[iArr[0]][iArr[1]] = 1;
					map[jArr[0]][jArr[1]] = 1;
					map[kArr[0]][kArr[1]] = 1;
					BFS();
					map[iArr[0]][iArr[1]] = 0;
					map[jArr[0]][jArr[1]] = 0;
					map[kArr[0]][kArr[1]] = 0;
				}
			}
		}
		System.out.println(max);
	}
}
