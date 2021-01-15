package baekjoon_simulation;
// https://www.acmicpc.net/problem/1043
// °ÅÁþ¸»
import java.util.*;
public class baekjoon_1043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		boolean[] tol = new boolean[n + 1];
		Queue<Integer> q = new LinkedList<>();
		int truth = sc.nextInt();
		for(int i = 0; i < truth; i++) {
			int x = sc.nextInt();
			tol[x] = true;
			q.add(x);
		}
		ArrayList<ArrayList<Integer>> party = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> people = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) people.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			int p = sc.nextInt();
			for(int j = 0; j < p; j++) {
				int x = sc.nextInt();
				list.add(x);
				people.get(x).add(i);
			}
			party.add(list);
		}
		while(!q.isEmpty()) {
			int p = q.poll();
			ArrayList<Integer> list = people.get(p);
			for(int i = 0; i < list.size(); i++) {
				ArrayList<Integer> plist = party.get(list.get(i));
				for(int j : plist) {
					if(tol[j] == false) {
						tol[j] = true;
						q.add(j);
					}
				}
			}
		}
		for(ArrayList<Integer> part : party) {
			boolean find = false;
			for(int i : part) find = tol[i] ? true : (find | false);
			if(find == false) cnt++;
		}
		System.out.print(cnt);
	}
}
