package baekjoon_DP;
// https://www.acmicpc.net/problem/2096
// 내려가기
import java.util.*;
public class baekjoon_2096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] max = new int[n][3], min = new int[n][3];
		for(int i = 0; i < 3; i++) max[0][i] = min[0][i] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				int x = sc.nextInt(), Min = 1 << 30, Max = 0;
				for(int k = -1; k < 2; k++) {
					int idx = j + k;
					if(0 <= idx && idx < 3) {
						Min = Math.min(min[i-1][idx], Min);
						Max = Math.max(max[i-1][idx], Max);
					}
				}
				min[i][j] = x + Min;
				max[i][j] = x + Max;
			}
		}
		System.out.println(Arrays.stream(max[n-1]).max().getAsInt() + " " + Arrays.stream(min[n-1]).min().getAsInt());
	}
}
