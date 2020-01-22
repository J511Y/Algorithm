package baekjoon_DFSBFS;
import java.util.*;
public class baekjoon_18243 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[][] net = new int[n + 1][n + 1];
		int[] vst = new int[n + 1];
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			net[a][b] = net[b][a] = 1;
		}
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1, 1}); vst[1] = 1;
		while(!q.isEmpty()) {
			int[] dot = q.poll();
			if(dot[1] == 7) continue;
			for(int i = 1; i < n + 1; i++) {
				if(vst[i] == 0 && net[dot[0]][i] == 1) {
					vst[i] = 1;
					q.add(new int [] {i, dot[1] + 1});
				}
			}
		}
		if(Arrays.stream(vst).sum() == n) {
			System.out.println("Small World!");
		}else {
			System.out.println("Big World!");
		}
	}
}
