package baekjoon_문자열기본;

import java.util.*;
public class baekjoon_21771 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), rst = 0;
		for(int i = 0; i < 3; i++) sc.nextInt();
		int c = sc.nextInt(), d = sc.nextInt();
		char[][] arr = new char[n][];
		for(int i = 0; i < n; i++) arr[i] = sc.next().toCharArray();
		for(int i = 0; i <= n - c; i++) {
			for(int j = 0; j <= n - d; j++) {
				boolean flag = true;
				for(int a = 0; a < c && flag; a++) {
					for(int b = 0; b < d && flag; b++) {
						int x = i + a, y = j + b;
						if(arr[x][y] != 'P') flag = false;
					}
				}
				if(flag) {
					System.out.print("0");
					return;
				}
			}
		}
		System.out.print(1);
	}
}
