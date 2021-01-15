package baekjoon_geometry;
// https://www.acmicpc.net/problem/1485
// 정사각형
import java.util.*;
public class baekjoon_1485 {
	static double distance(int[] a, int[] b) {
		int x = a[0] - b[0], y = a[1] - b[1];
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int[][] arr = new int[4][2];
			double min = 1 << 30, max = 0; 
			for(int j = 0; j < 4; j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
				if(j > 0) {
					min = Math.min(min, distance(arr[0], arr[j]));
					max = Math.max(max, distance(arr[0], arr[j]));
				}
			}
			int minCnt = 0, maxCnt = 0;
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == k) continue;
					double d = distance(arr[j], arr[k]);
					if(d == min) minCnt++;
					if(d == max) maxCnt++;
				}
			}
			if(minCnt == 8 && maxCnt == 4) System.out.println(1);
			else System.out.println(0);
		}
	}
}
