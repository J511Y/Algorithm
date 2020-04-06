package baekjoon_DP;
import java.io.*;
import java.util.*;
class baekjoon_2098 {
	static int N;
	static int[][] cost, W;
	static int INF = 1 << 30;
	static int tour(int start, int visit) {
		if(visit == (1 << N) - 1) return W[start][0] == 0 ? INF : W[start][0];
		if(cost[start][visit] >= 0) return cost[start][visit];
		int result = INF;
		for (int i = 0; i < N; i++) {
			if(W[start][i] != 0 && (visit & (1 << i)) == 0) {
				result = Math.min(result, tour(i, visit | (1 << i)) + W[start][i]);
			}
		}
		cost[start][visit] = result;
		return cost[start][visit];
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		cost = new int[N][1 << N];
		for (int i = 0; i < N; i++) {
            Arrays.fill(cost[i], -1);
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(tour(0, 1));
	}
}
