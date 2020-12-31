package goodbyeBaekjoon2020;

import java.util.*;
import java.io.*;
public class Problem1 {
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int rst = 0, n;
	static int[] vst;
	static void dfs(char[][] arr, char c) {
		if(Arrays.stream(vst).sum() == n) {
			rst = 1;
			return;
		}
		for(int i = 0; i < n; i++) {
			if((c == ' ' || arr[i][0] == c) && vst[i] == 0) {
				vst[i] = 1;
				dfs(arr, arr[i][1]);
				vst[i] = 0;
				if(rst == 1) return;
			}
		}
	}
	public static void main(String[] args) {
		n = sc.nextInt();
		vst = new int[n];
		char[][] arr = new char[n][2];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			arr[i][0] = s.charAt(0);
			arr[i][1] = s.charAt(s.length() - 1);
		}
		dfs(arr, ' ');
		System.out.println(rst);
	}
}
