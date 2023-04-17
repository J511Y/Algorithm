import java.util.*;
import java.io.*;
class Main {
	static List<List<Integer>> map = new ArrayList<>();
	static int[] vst;
	static int n, m, v, r;
	static int Int(String s) { return Integer.parseInt(s); }
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		n = Int(st.nextToken());
		m = Int(st.nextToken());
		r = Int(st.nextToken()) - 1;
		vst = new int[n];
		for(int i = 0; i < n; i++) map.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(sc.nextLine());
			int a = Int(st.nextToken()) - 1, b = Int(st.nextToken()) - 1;
			map.get(a).add(b);
			map.get(b).add(a);
		}
		for(int i = 0; i < n; i++) map.get(i).sort((a, b) -> a - b);
		
		Queue<Integer> q = new LinkedList<>();
		q.add(r);
		vst[r] = ++v;
		while(!q.isEmpty()) {
			int s = q.poll();
			for(int i : map.get(s)) {
				if (vst[i] == 0) {
					q.add(i);
					vst[i] = ++v;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i : vst) sb.append(i + "\n");
		System.out.print(sb);
	}
}