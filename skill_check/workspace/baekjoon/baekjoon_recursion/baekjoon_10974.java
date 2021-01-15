package baekjoon_recursion;
// https://www.acmicpc.net/problem/10974
// 모든 순열
public class baekjoon_10974 {
	static void func(int n, int[] arr, String s, int depth) {
		if(depth == n) System.out.println(s.trim());
		else {
			for(int i = 0; i < n; i++) {
				if(arr[i] == 0) {
					arr[i] = 1;
					func(n, arr, s + " " + (i+1), depth + 1);
					arr[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		func(n, new int[n], "", 0);
	}
}
