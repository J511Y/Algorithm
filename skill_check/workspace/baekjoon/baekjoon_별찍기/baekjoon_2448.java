package baekjoon_º°Âï±â;

import java.util.*;
public class baekjoon_2448 {
	static char[][] arr;
	static void draw(int n, int i, int j) {
		if(n == 3) {
			arr[i+1][j+1] = arr[i+1][j-1] =arr[i][j] = '*';
			for(int k = -2; k <= 2; k++) arr[i+2][j+k] = '*';
			return;
		}
		int m = n / 2;
		draw(m, i, j);
		draw(m, i + m, j - m);
		draw(m, i + m, j + m);
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		arr = new char[n][n * 2 - 1];
		for(char[] c : arr) Arrays.fill(c, ' ');
		draw(n, 0, n - 1);
		for(int i = 0; i < n; i++) System.out.print(new String(arr[i]) + (i == n - 1 ? "" : "\n"));
	}
}
