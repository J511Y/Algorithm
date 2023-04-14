import java.util.*;
class Node{
	int x;
	int y;
	int z;
	int idx;
	Node(int x, int y, int z, int idx){
		this.x = x;
		this.y = y;
		this.z = z;
		this.idx = idx;
	}
}
class Main{
	static int n;
	static int[] uf;
	static Node[] node;
	static PriorityQueue<int[]> edge = new PriorityQueue<int[]>((a1, a2) -> {return a1[2] - a2[2];});
	static void createEdge(int x) {
		Comparator<Node> comp = (n1, n2) -> n1.x < n2.x ? -1 : 1;
		Arrays.parallelSort(node, comp);
		for(int i = 1; i < n; i++) edge.add(new int[] {node[i - 1].idx, node[i].idx, Math.abs(node[i].x - node[i - 1].x)});
		
		comp = (n1, n2) -> n1.y < n2.y ? -1 : 1;
		Arrays.parallelSort(node, comp);
		for(int i = 1; i < n; i++) edge.add(new int[] {node[i - 1].idx, node[i].idx, Math.abs(node[i].y - node[i - 1].y)});
		
		comp = (n1, n2) -> n1.z < n2.z ? -1 : 1;
		Arrays.parallelSort(node, comp);
		for(int i = 1; i < n; i++) edge.add(new int[] {node[i - 1].idx, node[i].idx, Math.abs(node[i].z - node[i - 1].z)});
	}
	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) uf[b] = a;
	}
	static int find(int a) {
		if(a == uf[a]) return a;
		return uf[a] = find(uf[a]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		uf = new int[n + 1];
		node = new Node[n];
		for(int i = 0; i <= n; i++) uf[i] = i;
		for(int i = 0; i < n; i++) node[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt(), i);
		createEdge(0);
		int sum = 0, cnt = 0;
		while(cnt < n && !edge.isEmpty()) {
			int[] e = edge.poll();
			int a = e[0], b = e[1], cost = e[2];
			if(find(a) != find(b)) {
				union(a, b);
				sum += cost;
				cnt++;
			}
		}
		System.out.println(sum);
	}
}