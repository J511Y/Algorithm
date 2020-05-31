package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/49188
// 사이클 제거
import java.util.*;
public class prgmers_49188 {
	static List<Integer>[] list = new ArrayList[5000];
	static int[] cnt = new int[5000], dfsn = new int[5000];
	static int dcnt = 0;
	static int dfs(int now, int prev) {
		System.out.println("call method: " + now + ", " + prev);
		int tmp, ret = dfsn[now] = dcnt++;
		for(int next : list[now]) if(next != prev) {
			if(dfsn[next] == -1) tmp = dfs(next, now);
			else {
				tmp = dfsn[next];
				if(tmp > dfsn[now]) continue;
			}
			
			if(tmp >= dfsn[now]) cnt[now]++;
			ret = Math.min(ret, tmp);
		}
		if(prev == -1) cnt[now] = Math.max(0, cnt[now] - 1);
		return ret;
	}
	static public int solution(int n, int[][] edges) {
		for(int i = 0; i < 5000; i++) list[i] = new ArrayList<Integer>();
		for(int[] edge : edges) {
			int i = edge[0] - 1, j = edge[1] - 1;
			list[i].add(j);
			list[j].add(i);
		}
		Arrays.fill(dfsn, -1);
		dfs(0, -1);
		System.out.println(Arrays.toString(cnt));
		System.out.println(Arrays.toString(dfsn));
		int answer = 0;
		for(int i = 0; i < n; i++) if(edges.length - list[i].size() + cnt[i] < n - 1) answer += i + 1;
		return answer;
	}
	public static void main(String[] args) {
//		System.out.println(solution(4, new int[][]{{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}}));
//		System.out.println(solution(6, new int[][]{{1, 2}, {1, 3}, {2, 3}, {4, 5}, {5, 6}, {4, 6}}));
		System.out.println(solution(8, new int[][]{{1, 8}, {1, 2}, {2, 3}, {3, 4}, {2, 7}, {7, 8}}));
	}

}
