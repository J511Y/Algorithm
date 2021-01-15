package baekjoon_graph;
// https://www.acmicpc.net/problem/11967
// ºÒÄÑ±â
import java.util.*;
import java.io.*;
public class baekjoon_11967 {
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static int Int(String s) {
		return Integer.parseInt(s);
	}
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Int(st.nextToken()), m = Int(st.nextToken()), cnt = 0;
        boolean[][] vst = new boolean[n][n], map = new boolean[n][n];
        ArrayList<Integer>[][] list = new ArrayList[n][n];
        for(int i = 0; i < n * n; i++) list[i/n][i%n] = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine());
        	list[Int(st.nextToken()) - 1][Int(st.nextToken()) - 1].add((Int(st.nextToken()) - 1) * n + Int(st.nextToken()) - 1);
        }
        map[0][0] = vst[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        while(!q.isEmpty()) {
        	int[] poll = q.poll();
        	int a = poll[0], b = poll[1];
        	for(int i = 0; i < list[a][b].size(); i++) {
        		int x = list[a][b].get(i) / n, y = list[a][b].get(i) % n;
        		map[x][y] = true;
        	}
        	if(q.isEmpty()) {
        		boolean[][] vst2 = new boolean[n][n];
        		vst2[0][0] = true;
        		Queue<int[]> q2 = new LinkedList<>();
        		q2.add(new int[] {0, 0});
        		while(!q2.isEmpty()) {
        			int[] p = q2.poll();
        			int x = p[0], y = p[1];
        			for(int i = 0; i < 4; i++) {
        				int X = x + WH[0][i], Y = y + WH[1][i];
        				if(0 <= X && 0 <= Y && X < n && Y < n && map[X][Y]) {
        					if(!vst2[X][Y]) {
        						if(vst[X][Y]) {
        							q2.add(new int[] {X, Y});
        							vst2[X][Y] = true;        							
        						}else {
        							q.add(new int[] {X, Y});
        							vst[X][Y] = true;        							
        						}
        					}
        				}
        			}
        		}
        	}
        }
        for(boolean[] arr : map) {
        	for(boolean b : arr) cnt += b ? 1 : 0;
        }
        System.out.println(cnt);
    }
}
