package baekjoon_DP;
// https://www.acmicpc.net/problem/1672
// DNA ÇØµ¶
import java.util.*;
public class baekjoon_1672 {
	static int[][] arr = {{0,2,0,1}, {2,1,3,0}, {0,3,2,1}, {1,0,1,3}};
	static char make(char c1, char c2) {
		int i = change(c1), j = change(c2);
		int k = arr[i][j];
		if(k == 0) return 'A';
		if(k == 1) return 'G';
		if(k == 2) return 'C';
		return 'T';
	}
	static int change(char c) {
		if(c == 'A') return 0;
		if(c == 'G') return 1;
		if(c == 'C') return 2;
		return 3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String s = sc.next();
		char[] arr = s.toCharArray();
		char c;
		for(int i = arr.length - 2; i >= 0; i--) {
			c = make(arr[i], arr[i + 1]);
			arr[i] = c;
		}
		System.out.println(arr[0]);
	}
}
