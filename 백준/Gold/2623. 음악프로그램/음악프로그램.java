import java.util.*;
public class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		List<List<Integer>> childs = new ArrayList<>();
		for(int i = 0; i <= n; i++) childs.add(new ArrayList<>());
		int[] in = new int[n + 1];
		for(int i = 0; i < m; i++) {
			int k = sc.nextInt();
			for(int a = sc.nextInt(); k > 1; k--) {
				int b = sc.nextInt();
				in[b]++;
				childs.get(a).add(b);
				a = b;
			}
		}
		
		List<Integer> result = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] vst = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			if (in[i] == 0) {
				vst[i] = true;
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int p = q.poll();
			result.add(p);
			for(int next : childs.get(p)) {
				in[next]--;
				if (in[next] == 0) {
					vst[next] = true;
					q.add(next);
				}
			}
		}
		
		if (result.size() == n) for(int i : result) System.out.println(i);
		else System.out.println(0);
	}
}