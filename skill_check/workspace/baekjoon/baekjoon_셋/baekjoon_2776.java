package baekjoon_¼Â;

import java.util.*;
class baekjoon_2776{
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int t = Int(sc.nextLine());
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			int n = Int(sc.nextLine());
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			Set<Integer> set = new HashSet<>();
			while(n-->0) set.add(Int(st.nextToken()));
			int m = Int(sc.nextLine());
			st = new StringTokenizer(sc.nextLine());
			while(m-->0) sb.append((set.contains(Int(st.nextToken())) ? 1 : 0) + "\n");
		}
		System.out.print(sb);
	}
}