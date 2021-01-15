package baekjoon_DFS_BFS;

import java.util.*;
public class baekjoon_1167 {
	static class Node{
		int n, d;
		Node(int n, int d){
			this.n = n;
			this.d = d;
		}
	}
	static int n;
	static ArrayList<Node>[] list;
	static Node bfs(int s) {
		Queue<Node> q = new LinkedList<>();
		boolean[] vst = new boolean[n + 1];
		vst[s] = true;
		q.add(new Node(s, 0));
		Node rst = new Node(s, 0);
		while(!q.isEmpty()) {
			Node p = q.poll();
			if(rst.d < p.d) rst = p;
			for(Node i : list[p.n]) {
				if(vst[i.n] == false) {
					vst[i.n] = true;
					q.add(new Node(i.n, p.d + i.d));
				}
			}
		}
		return rst;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		list = new ArrayList[n + 1];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			while(true) {
				int b = sc.nextInt();
				if(b == -1) break;
				int c = sc.nextInt();
				if(list[a] == null) list[a] = new ArrayList<>();
				if(list[b] == null) list[b] = new ArrayList<>();
				list[a].add(new Node(b, c));
				list[b].add(new Node(a, c));
			}
		}
		System.out.print(bfs(bfs(1).n).d);
	}
}
