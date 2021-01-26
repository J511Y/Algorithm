package baekjoon_Æ®¸®;
import java.util.*;
public class baekjoon_18243 {
	static int n;
	static int[][] net;
	static int[] bfs(int x) {
		if(x == -1) return new int[] {0, 7};
		int[] vst = new int[n + 1], rst = null;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, 0});
		vst[x] = 1;
		while(!q.isEmpty()) {
			int[] dot = q.poll();
			rst = dot;
			if(dot[1] == 6) continue;
			for(int i = 1; i < n + 1; i++) {
				if(vst[i] == 0 && net[dot[0]][i] == 1) {
					vst[i] = 1;
					q.add(new int [] {i, dot[1] + 1});
				}
			}
		}
		if(Arrays.stream(vst).sum() < n) return new int[]{-1, 7};
		return rst;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		net = new int[n + 1][n + 1];
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			net[a][b] = net[b][a] = 1;
		}
		int[] s = bfs(1), e = bfs(s[0]);
		if(e[1] <= 6) {
			System.out.println("Small World!");
		}else {
			System.out.println("Big World!");
		}
	}
}
