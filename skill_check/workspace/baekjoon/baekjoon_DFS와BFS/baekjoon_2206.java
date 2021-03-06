package baekjoon_DFS와BFS;
import java.util.*;
public class baekjoon_2206 {
	static int width, height;
	static int [] wth = new int [] {1, 0, -1, 0};
	static int [] hth = new int [] {0, 1, 0, -1};
	public static int dfs(int[] coor, int[][] input, int[][] visit, boolean crush, int cnt) {
		System.out.println(coor[0] + ", "+coor[1] + "로 들어왔네여! 현재 cnt :"+cnt);
		visit[coor[0]][coor[1]] = 1;
		if(coor[0] == width-1 && coor[1] == height-1) return cnt;
		for(int i=0; i<4; i++) {
			int w = coor[0] + wth[i]; 
			int h = coor[1] + hth[i];
			if(-1 < w && w < width && -1 < h && h < height && visit[w][h] == 0) {
				if(input[w][h] == 1) {
					// 막혀있는 길 && 뚫을 수 있는 기회 있을 때
					if(!crush) {
						int[][] temp = input;
						temp[w][h] = 0;
						System.out.println(w+", "+h+ " 뿌사부러!~");
						cnt = dfs(new int [] {w, h}, temp, visit, !crush, cnt+1);				
					}
				}else {
					// 열려있는 길
					System.out.println(w+", "+h+ " 뚫려있던데?");
					cnt = dfs(new int [] {w, h}, input, visit, crush, cnt+1);
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		width = n; height = m;
		int[][] visit = new int [n][m]; 
		int[][] input = new int [n][m];
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<m; j++)
				input[i][j] = s.charAt(j)-'0';
		}
		System.out.println(dfs(new int [] {0,0}, input, visit, false, 1));
		
	}

}
