package baekjoon_DFS와BFS;

// https://www.acmicpc.net/problem/1963
// 소수 경로
import java.util.*;
class Node{
	int val;
	int depth;
	Node(int val, int depth){
		this.val = val;
		this.depth = depth;
	}
}
public class baekjoon_1963 {
	static boolean [] primes = new boolean[10000], vst;
	static {
		for(int i = 1000; i < 10000; i++) {
			boolean prime = true;
			for(int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
				if(i % j == 0) prime = false;
			}
			if(prime) primes[i] = true;
		}
	}
	static int Change(String s, int idx, int val) {
		byte[] bytes = s.getBytes();
		int result = 0;
		for(int i = 0; i < 4; i++) {
			result *= 10;
			result += i == idx ? val : (bytes[i] - '0');
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			int start = sc.nextInt(), end = sc.nextInt(), result = 0;
			vst = new boolean[10000];
			Queue<Node> q = new LinkedList<>();
			q.add(new Node(start, 0));
			vst[start] = true;
			while(!q.isEmpty()) {
				Node node = q.poll();
				if(node.val == end) {
					result = node.depth;
					break;
				}
				for(int j = 0; j < 4; j++) {
					for(int k = j == 0 ? 1 : 0; k < 10; k++) {
						int change = Change(node.val + "", j, k);
						if(primes[change] && !vst[change]) {
							q.add(new Node(change, node.depth + 1));
							vst[change] = true;
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}
