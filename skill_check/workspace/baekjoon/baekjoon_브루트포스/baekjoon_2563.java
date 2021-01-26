package baekjoon_브루트포스;
// https://www.acmicpc.net/problem/2563
// 색종이
import java.util.*;
class baekjoon_2563{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int[][] paper = new int[100][100];
		int n = sc.nextInt(), cnt = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			for(int j = x + 9; j >= x; j--) {
				for(int k = y + 9; k >= y; k--) {
					paper[j][k] = 1;
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				cnt += paper[i][j];
			}
		}
		System.out.println(cnt);
	}
}