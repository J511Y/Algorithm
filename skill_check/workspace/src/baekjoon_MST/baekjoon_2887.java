package baekjoon_MST;
// https://www.acmicpc.net/problem/2887
// �༺ �ͳ�

/*
 * ����
���� 2040��, �̹����� ���ֿ� �ڽŸ��� �ձ��� �������. 
�ձ��� N���� �༺���� �̷���� �ִ�. 
�����̴� �� �༺�� ȿ�������� �����ϱ� ���ؼ� �༺�� �����ϴ� �ͳ��� ������� �Ѵ�.

�༺�� 3���� ��ǥ���� �� ������ �����ϸ� �ȴ�. 
�� �༺ A(xA, yA, zA)�� B(xB, yB, zB)�� �ͳη� ������ �� ��� �����
min(|xA-xB|, |yA-yB|, |zA-zB|)�̴�.

�����̴� �ͳ��� �� N-1�� �Ǽ��ؼ� ��� �༺�� ���� ����ǰ� �Ϸ��� �Ѵ�. 
�̶�, ��� �༺�� �ͳη� �����ϴµ� �ʿ��� �ּ� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �༺�� ���� N�� �־�����. 
(1 �� N �� 100,000) ���� N�� �ٿ��� �� �༺�� x, y, z��ǥ�� �־�����. 
��ǥ�� -109���� ũ�ų� ����, 109���� �۰ų� ���� �����̴�. 
�� ��ġ�� �༺�� �� �� �̻� �ִ� ���� ����. 

���
ù° �ٿ� ��� �༺�� �ͳη� �����ϴµ� �ʿ��� �ּ� ����� ����Ѵ�.
 */

/*
 * ���� Ǯ�� �� ���� 2020.02.01 23:09
 * ---------------
 * MST�� brute force�� ��ģ �� ���� ����.
 * �������� �Է����� ������ ���� ������ �־����ٸ�
 * �̹����� ������ ���� ������ �ְ�, ������ ���� ������ ���� ������ �ϴ� ����.
 * �״� ����� �� ������ �ʴ�.
 * �� �������� �ٸ� �������� ����Ǵ� ������ ���� ������ ��� �޾� �ξ��ٰ� ũ�罺Į�� Ǯ�� ���� ������?
 * 
 * ���� Ǯ�鼭 �� ���� 2020.02.01 23:26
 * ---------------
 * ���� �����ϱ� ���̱� �ѵ�.. �༺�� ������ 10�� ���� ������ �� ���� ���� ���ɼ��� ���� �� ����.
 * ������ ���� ������ �뷫 50�ﰳ�� �ʿ��ѵ�... �̰� ���� ������ �ɱ�..?
 * �𸣰ڴ� �ϴ� �����غ�
 * 
 * �����ߴ��� ���ó� �޸��ʰ� �߻�.
 * ���� ����� ������..
 * �ϴ� ���� ���� ��� �������δ� ��� ������ ���� ������ ������ �ʿ� ��ü�� ���� �� ����.
 * ������ ����� �ֵ�θ� ������ ������ �����Ѵٸ� �𸦱�.. ���ʿ� �������� ���� �������� �ʹ� ������ �ִ� �� �ƴұ� �Ѵ�.
 * �� ���� ����� ��������� ������ �ᱹ ������ �ؾ��Ѵٴ� �ǵ�.
 * �̰� �� �� ������ �غ��߰ڴ�.
 * 
 * �� Ǯ�� �� ���� 2020.02.02 22:51
 * ---------------
 * ���� ����� ������� ����� �� ���� ���θ� ������ ����� �� �ٽ��� �� ����.
 * �׷��� ���ؼ� ������ �ʿ��� �� ����.. ������ ���ǿ� ���ؼ� ����� �� �� �غ��߰ڴ�.
 * �ܼ��� x, y, z�� ���� ������ �����Ѵٰ� ġ�� x�� ���� �� y, z�� ��û �� ��쵵 ���� �� �����״ϱ� ���̴�.
 * 
 * ����� ������ �ȳ��� �˻��غô��� �׳� x, y, z ��� �� ���� �����ؼ� ������ ��峢���� ������ �������� ����̴���.
 * �غ���¡
 * 
 * �� Ǯ�� �� ���� 2020.02.02 23:15
 * ---------------
 * ���� �߰��ϴ� ���� �����ߴ��� ����ߴ�.
 * �����ϸ鼭 �䰡�ΰ� �ߴµ� �� §��..?
 * ��·�� ������ �ִ� �κ��� ���� ������ �����ϴ� ���̿����� ����Ҹ� �ߴ�.
 */
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
public class baekjoon_2887 {
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


/*
 * import java.util.*;
class Node{
	int x;
	int y;
	int z;
	Node(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class baekjoon_2887 {
	static int n;
	static int[] uf;
	static Node[] node;
	static PriorityQueue<int[]> edge = new PriorityQueue<int[]>((a1, a2) -> {return a1[2] - a2[2];});
	static void createEdge(int x) {
		if(x == n) return;
		Node n1 = node[x];
		for(int i = x + 1; i < n; i++) {
			Node n2 = node[i];
			int min = Math.min(Math.abs(n1.x - n2.x), Math.abs(n1.y - n2.y));
			min = Math.min(min, Math.abs(n1.z - n2.z));
			edge.add(new int[] {x, i, min});
		}
		createEdge(x + 1);
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
	static boolean allSame() {
		int x = uf[1];
		for(int i = 2; i < uf.length; i++) {
			if(x != uf[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		uf = new int[n + 1];
		node = new Node[n];
		for(int i = 0; i <= n; i++) uf[i] = i;
		for(int i = 0; i < n; i++) node[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
		createEdge(0);
		int sum = 0;
		while(!(allSame() || edge.isEmpty())) {
			int[] e = edge.poll();
			int a = e[0], b = e[1], cost = e[2];
			if(find(a) != find(b)) {
				union(a, b);
				sum += cost;
			}
		}
		System.out.println(sum);
	}
}
 */
