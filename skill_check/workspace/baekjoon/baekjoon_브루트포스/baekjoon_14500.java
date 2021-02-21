package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_14500 {
	static boolean isRange(int a, int b, int n, int m) {
		return 0 <= a && 0 <= b && a < n && b < m;
	}
	static int[][][] makePoly(int t) {
		int[][][] poly;
		if(t == 0) {
			poly = new int[][][] {
				{{0, 0},{0, 1},{0, 2},{0, 3}},
				{{0, 0},{1, 0},{2, 0},{3, 0}}
			};
		} else if (t == 1) {
			poly = new int[][][] {{{0, 0}, {1, 0}, {0, 1}, {1, 1}}};
		} else if (t == 2) {
			poly = new int[][][] {
				{{0, 0},{1, 0},{2, 0},{2, 1}},
				{{0, 0},{1, 0},{2, 0},{2, -1}},
				{{0, 0},{0, 1},{0, 2},{1, 0}},
				{{0, 0},{0, 1},{0, 2},{1, 2}},
				{{0, 0},{0, 1},{1, 1},{2, 1}},
				{{0, 0},{0, 1},{1, 0},{2, 0}},
				{{0, 0},{0, 1},{0, 2},{-1, 2}},
				{{0, 0},{0, 1},{0, 2},{-1, 0}},
			};
		} else if (t == 3) {
			poly = new int[][][] {
				{{0, 0},{1, 0},{1, 1},{2, 1}},
				{{0, 1},{1, 0},{1, 1},{2, 0}},
				{{0, 0},{0, 1},{-1, 1},{-1, 2}},
				{{0, 0},{0, 1},{1, 1},{1, 2}},
			};
		} else {
			poly = new int[][][] {
				{{0, 0},{0, 1},{0, 2},{1, 1}},
				{{0, 1},{1, 0},{1, 1},{2, 1}},
				{{1, 0},{1, 1},{0, 1},{1, 2}},
				{{0, 0},{1, 0},{1, 1},{2, 0}},
			};
		}
		return poly;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), max = 0;
		int[][] map = new int[n][m];
		for(int i = 0; i < n * m; i++) map[i/m][i%m] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int t = 0; t < 5; t++) {
					int[][][] poly = makePoly(t);
					for(int[][] pol : poly) {
						boolean flag = true;
						for(int[] p : pol) flag &= isRange(i + p[0], j + p[1], n, m);
						if(flag) {
							int sum = 0;
							for(int[] p : pol) sum += map[i + p[0]][j + p[1]];
							max = Math.max(max, sum);
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
