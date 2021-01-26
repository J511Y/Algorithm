package baekjoon_그래프;
// https://www.acmicpc.net/problem/1058
// 친구
import java.util.*;
public class baekjoon_1058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;
		int[][] map = new int[n][n];
		for(int i = 0; i < n; i++) {
			byte[] b = sc.next().getBytes();
			for(int j = 0; j < n; j++) map[i][j] = b[j] == 'Y' ? 1 : 0;
		}
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				if(map[i][j] == 1) cnt++;
				else {
					for(int k = 0; k < n; k++) {
						if(map[i][k] == 1 && map[k][j] == 1) {
							cnt++;
							break;
						}
					}
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.print(max);
	}
}
