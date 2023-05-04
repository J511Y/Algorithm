import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		List<List<Integer>> childs = new ArrayList<>();
		for(int i = 0; i <= n; i++) childs.add(new ArrayList<>());
		int[] in = new int[n + 1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			in[b]++;
			childs.get(a).add(b);
		}
		
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
		boolean[] vst = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			if (in[i] == 0) {
				vst[i] = true;
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int p = q.poll();
			sb.append(p + " ");
			for(int next : childs.get(p)) {
				in[next]--;
				if (in[next] == 0) {
					vst[next] = true;
					q.add(next);
				}
			}
		}
		
		System.out.print(sb);
	}
}