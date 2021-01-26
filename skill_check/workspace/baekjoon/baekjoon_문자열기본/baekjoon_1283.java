package baekjoon_문자열기본;

import java.util.*;
public class baekjoon_1283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[][] arr = new String[n][];
		int[] chk = new int[26];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine().split(" ");
			boolean flag = false;
			for(int j = 0; j < arr[i].length; j++) {
				String s = arr[i][j];
				String lower = s.toLowerCase();
				char c = lower.charAt(0);
				if (Check(chk, c)) {
					arr[i][j] = "[" + s.charAt(0) + "]" + s.substring(1);
					flag = true;
					break;
				}
			}
			if(!flag) {
				for(int j = 0; j < arr[i].length && !flag; j++) {
					String s = arr[i][j];
					String lower = s.toLowerCase();
					for(int k = 0; k < lower.length(); k++) {
						char c = lower.charAt(k);
						if (Check(chk, c)) {
							arr[i][j] = s.substring(0, k) + "[" + s.charAt(k) + "]" + s.substring(k + 1);
							flag = true;
							break;
						}
					}
				}
			}
			System.out.println(String.join(" ", arr[i]));
		}
	}
	static boolean Check(int[] chk, char c) {
		boolean rtn = chk[c - 'a'] == 0;
		chk[c - 'a'] = 1;
		return rtn;
	}
}
