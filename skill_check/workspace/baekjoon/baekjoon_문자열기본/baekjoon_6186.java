package baekjoon_문자열기본;
// https://www.acmicpc.net/problem/6186
// Best Grass
import java.util.*;
public class baekjoon_6186 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		byte[][] map = new byte[n][];
		for(int i = 0; i < n; i++) map[i] = sc.next().getBytes();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == '#') {
					cnt++;
					if(i < n - 1) map[i+1][j] = '.';
					if(j < m - 1) map[i][j+1] = '.';
				}
			}
		}
		System.out.println(cnt);
	}
}
