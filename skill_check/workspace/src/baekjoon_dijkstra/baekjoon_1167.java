package baekjoon_dijkstra;
// https://www.acmicpc.net/problem/1167
// 트리의 지름
import java.util.*;
public class baekjoon_1167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), idx = -1, len = 0;
		ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) map.add(new ArrayList<Integer>());
		boolean[] vst = new boolean[n+1];
		for(int i = 0; i < n; i++) {
			int j = sc.nextInt(), x;
			while((x = sc.nextInt()) != -1) {
				map.get(j).add(x);
				map.get(x).add(j);
			}
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(1); vst[1] = true;
		while(!q.isEmpty()) {
			int p = idx = q.poll();
			for(int i = 0; i < map.get(p).size(); i++) {
				int next = map.get(p).get(i);
				if(vst[next] == false) {
					vst[next] = true;
					q.add(next);
				}
			}
		}
		vst = new boolean[n+1];
		vst[idx] = true;
		q.add(idx);
		while(!q.isEmpty()) {
			len++;
			int p = idx = q.poll();
			for(int i = 0; i < map.get(p).size(); i++) {
				int next = map.get(p).get(i);
				if(vst[next] == false) {
					vst[next] = true;
					q.add(next);
				}
			}
		}
		System.out.print(len);
	}
}
