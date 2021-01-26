package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_1107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), min = Math.abs(n - 100);
		boolean[] b = new boolean[10];
		for(int i = 0; i < m; i++) b[sc.nextInt()] = true;
		if(!b[0]) min = Math.min(min, n + 1);
		for(int i = 1; i < 1000001; i++) {
			int tmp = i, flag = 1;
			while(tmp > 0) {
				if(b[tmp % 10]) flag = 0;
				tmp /= 10;
			}
			if(flag == 1) min = Math.min(min, (i + "").length() + Math.abs(n - i));
		}
		System.out.print(min);
	}
}
