package baekjoon_recursion;

import java.util.*;
public class baekjoon_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			if(n == 0) System.out.println("1 0");
			else {
				int a = 0, b = 1;
				for(int i = 0; i < n - 1; i++) {
					int tmp = a;
					a = b;
					b = b + tmp;
				}
				System.out.println(a + " " + b);
			}
		}
	}
}
