package baekjoon_구현;
// https://www.acmicpc.net/problem/8320
// 직사각형을 만드는 방법
public class baekjoon_8320 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt(), cnt = 0;
		int[][] arr = new int[10001][10001];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; i * j <= n; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = arr[j][i] = 1;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
