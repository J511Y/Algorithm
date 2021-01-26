package baekjoon_기하학;
// https://www.acmicpc.net/problem/1064
// 평행사변형
import java.util.*;
public class baekjoon_1064 {
	static double distance(int[] a, int[] b) {
		int x = a[0] - b[0], y = a[1] - b[1];
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	static boolean check(int[][] arr) {
		double x = Math.abs(arr[0][0] - arr[1][0]), y = Math.abs(arr[0][1] - arr[1][1]);
		double a = Math.abs(arr[0][0] - arr[2][0]), b = Math.abs(arr[0][1] - arr[2][1]);
		double deg = y / x, ree = b / a;
		if(deg == ree) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][2];
		for(int i = 0; i < 3; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		if(check(arr)) {
			System.out.println(-1);
			return;
		}
		double min = 1 << 30, max = 0;
		for(int i = 0; i < 3; i++) {
			double d = 0;
			for(int j = 0; j < 3; j++) {
				if(i == j) continue;
				 d += distance(arr[i], arr[j]);
			}
			min = Math.min(min, d * 2);
			max = Math.max(max, d * 2);
		}
		System.out.println(max - min);
	}
}
