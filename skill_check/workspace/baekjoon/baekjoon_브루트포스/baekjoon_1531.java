package baekjoon_브루트포스;
// https://www.acmicpc.net/problem/1531
// 투명
import java.util.*;
public class baekjoon_1531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		int[][] arr = new int[101][101];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			for(int A = a; A <= c; A++) {
				for(int B = b; B <= d; B++) arr[A][B]++;
			}
		}
		for(int i = 1; i < 101; i++) {
			for(int j = 1; j < 101; j++) cnt += arr[i][j] > m ? 1 : 0;
		}
		System.out.print(cnt);
	}
}
