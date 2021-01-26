package baekjoon_애드혹;
// https://www.acmicpc.net/problem/17302
// 흰색으로 만들기
import java.util.*;
public class baekjoon_17302 {
	static int n, m;
	static int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static boolean isRange(int a, int b) {
		return 0 <= a && 0 <= b && a < n && b < m;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		n = sc.nextInt(); m = sc.nextInt();
		int[][] map = new int[n][m], result = new int[n][m];
		for(int i = 0; i < n; i++) {
			byte[] arr = sc.next().getBytes();
			for(int j = 0; j < m; j++) {
				map[i][j] = arr[j] == 'W' ? 1 : -1;
				result[i][j] = 2;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < 4; k++) {
					int a = i + WH[0][k];
					int b = j + WH[1][k];
					if(isRange(a, b)) map[a][b] *= -1;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == -1) result[i][j]++;
			}
		}
		System.out.println(1);
		for(int[] arr : result) {
			for(int i : arr) sb.append(i);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
