package baekjoon_simulation;

import java.util.Arrays;

// https://www.acmicpc.net/problem/1307
// ¸¶¹æÁø
public class baekjoon_1307 {
	static void holsu(int[][] arr, int n) {
		int x = 0, y = n / 2;
		for(int i = 1; i <= n * n; i++) {
			if(0 > x || n <= x) x = n + (x < 0 ? -1 : -n);
			if(0 > y || n <= y) y = n + (y < 0 ? -1 : -n);
			arr[x][y] = i;
			if(i % n == 0) x++;
			else {
				x--;
				y++;
			}
		}
	}
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int[][] arr = new int[n][n];
		if(n % 2 == 1) {
			holsu(arr, n);
		}else if(n % 4 == 0) {
			int[][] asc = new int[n][n], desc = new int[n][n];
			for(int i = 0; i < n * n; i++) {
				int x = i / n, y = i % n;
				asc[x][y] = i + 1;
				desc[n - x - 1][n - y - 1] = i + 1;
			}
			for(int i = 0; i < n; i++) {
				int plus = i % 4;
				for(int j = 0; j < n; j += 4) {
					arr[i][j + plus] = asc[i][j + plus];
					arr[i][n - (j + plus) - 1] = asc[i][n - (j + plus) - 1];
				}
			}
			for(int i = 0; i < n * n; i++) {
				int x = i / n, y = i % n;
				if(arr[x][y] > 0) continue;
				arr[x][y] = desc[x][y];
			}
		}else {
			holsu(arr, n / 2);
			for(int i = 0; i < n; i++) {
				if(i < n / 2) {
					for(int j = n / 2; j < n; j++) {
						arr[i][j] = arr[i][j - n / 2];
					}					
				}else {
					for(int j = 0; j < n; j++) {
						arr[i][j] = arr[i - n / 2][j];
					}
				}
			}
			int x = n * n / 4, four = n / 4, last = n - (n / 4 - 1);
			for(int i = 0; i < n / 2; i++) {
				int plus = i == four ? 1 : 0;
				for(int j = 0; j < four; j++) {
					arr[i][j + plus] += x * 3;
				}
				for(int j = n / 2; j < n; j++) {
					arr[i][j] += x * (j < last ? 2 : 1);
				}
			}
			for(int i = n / 2; i < n; i++) {
				for(int j = four; j < n / 2; j++) {
					if(i == n / 2 + four && j == four) arr[i][0] += x * 3;
					else arr[i][j] += x * 3;
				}
				for(int j = n / 2; j < n; j++) {
					arr[i][j] += x * (j < last ? 1 : 2);
				}
			}
		}
		for(int[] ar : arr) {
			for(int i : ar) System.out.print(i + " ");
			System.out.println();
		}
	}
}
