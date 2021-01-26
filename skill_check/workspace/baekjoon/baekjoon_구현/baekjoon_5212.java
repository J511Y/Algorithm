package baekjoon_구현;
// https://www.acmicpc.net/problem/5212
// 지구 온난화
import java.util.*;
public class baekjoon_5212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), imin = n, imax = 0, jmin = m, jmax = 0;
		int[][] WH = {{1, 0, -1, 0}, {0, 1, 0, -1}};
		char[][] arr = new char[n][], rst = new char[n][m];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next().toCharArray();
			rst[i] = Arrays.copyOf(arr[i], m);
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int cnt = 0;
				for(int k = 0; k < 4; k++) {
					int a = i + WH[0][k];
					int b = j + WH[1][k];
					if(0 <= a && 0 <= b && a < n && b < m) cnt+= arr[a][b] == '.' ? 1 : 0;
					else cnt++;
				}
				if(cnt >= 3) rst[i][j] = '.';
				if(rst[i][j] == 'X') {
					imin = Math.min(imin, i);
					imax = Math.max(imax, i);
					jmin = Math.min(jmin, j);
					jmax = Math.max(jmax, j);
				}
			}
		}
		for(; imin <= imax; imin++) {
			for(int j = jmin; j <= jmax; j++) System.out.print(rst[imin][j]);
			System.out.println();
		}
	}
}
