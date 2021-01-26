package baekjoon_그리디;
// https://www.acmicpc.net/problem/1080
// 행렬
import java.util.*;
public class baekjoon_1080 {
	static int[][] map, answer;
	static boolean equal() {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				if(map[i][j] != answer[i][j]) return false;
			}
		}
		return true;
	}
	static void flip(int x, int y) {
		for(int i = x; i < x + 3; i++) {
			for(int j = y; j < y + 3; j++) {
				map[i][j] ^= 1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		map = new int[n][m];
		answer = new int[n][m];
		for(int x = 0; x < 2; x++) {
			int[][] input = x == 0 ? map : answer;
			for(int i = 0; i < n; i++) {
				byte[] arr = sc.next().getBytes();
				for(int j = 0; j < m; j++) {
					input[i][j] = arr[j] - '0';
				}
			}
		}
		if(equal()) {
			System.out.println(0);
			return;
		}
		for(int i = 0; i <= n - 3; i++) {
			for(int j = 0; j <= m - 3; j++) {
				if(map[i][j] != answer[i][j]) {
					flip(i, j);
					cnt++;
					if(equal()) {
						System.out.print(cnt);
						return;
					}
				}
			}
		}
		System.out.print(-1);
	}
}
