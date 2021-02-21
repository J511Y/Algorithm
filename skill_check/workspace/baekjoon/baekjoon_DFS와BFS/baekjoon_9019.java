package baekjoon_DFS¿ÍBFS;
import java.util.*;
public class baekjoon_9019 {
	static class Node{
		int val;
		String oper;
		Node(int val, String oper, boolean[] vst) {
			this.val = val;
			this.oper = oper;
			vst[val] = true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(), b = sc.nextInt();
			Queue<Node> q = new LinkedList<>();
			boolean[] vst = new boolean[10000];
			q.add(new Node(a, "", vst));
			while(!q.isEmpty()) {
				Node node = q.poll();
				if(node.val == b) {
					System.out.println(node.oper);
					break;
				}
				int d = (node.val * 2) % 10000;
				int s = (node.val + 9999) % 10000;
				int l = ((node.val * 10) + (node.val / 1000)) % 10000;
				int r = (node.val / 10) + (node.val % 10) * 1000;
				if(!vst[d]) q.add(new Node(d, node.oper + "D", vst));
				if(!vst[s]) q.add(new Node(s, node.oper + "S", vst));
				if(!vst[l]) q.add(new Node(l, node.oper + "L", vst));
				if(!vst[r]) q.add(new Node(r, node.oper + "R", vst));
			}
		}
	}
}
