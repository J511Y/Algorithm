package baekjoon_geometry;
// https://www.acmicpc.net/problem/2881

import java.util.*;
public class baekjoon_2881 {
	static int count(List<Integer> list, int s, int e) {
		int cnt = 0;
		for(int i : list) cnt += (s <= i && i <= e) ? 1 : 0;
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] tree = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			tree[i] = new int[] {sc.nextInt(), sc.nextInt()};
		}
		
		Arrays.sort(tree, (a, b)->{
			int rst = a[0] - b[0];
			return rst == 0 ? a[1] - b[1] : rst;
		});
		
		int p = sc.nextInt();
		for(int i = 0; i < n; i++) {
		}
	}
}
