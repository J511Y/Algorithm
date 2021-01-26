package baekjoon_그리디;
// https://www.acmicpc.net/problem/15999
// 뒤집기
import java.util.*;
public class baekjoon_15999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		byte[][] input = new byte[n][];
		int[][] map = new int[n][m];
		for(int i = 0; i < n; i++) input[i] = sc.next().getBytes();
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 1; j++) {
				if(input[i][j] != input[i+1][j]) map[i][j] = map[i+1][j] = 1;
				if(input[i][j] != input[i][j+1]) map[i][j] = map[i][j+1] = 1;
			}
		}
		for(int[] arr : map) cnt += Arrays.stream(arr).sum();
		cnt = n * m - cnt;
		long result = 1;
		for(int i = 0; i < cnt; i++) {
			result *= 2;
			result %= 1000000007;
		}
		System.out.println(result);
	}
}
