package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_1342 {
	static int n;
	static int[] cnt;
	static char[] arr;
	static Set<String> set = new HashSet<>();
	static void dfs(int m, String s, char c) {
		if(m == n) set.add(s);
		else {
			for(int i = 0; i < n; i++) {
				if(c != arr[i] && cnt[arr[i] - 'a'] > 0) {
					cnt[arr[i] - 'a']--;
					dfs(m + 1, s + arr[i], arr[i]);
					cnt[arr[i] - 'a']++;
				}
			}
		}
	}
	public static void main(String[] args) {
		arr = new Scanner(System.in).next().toCharArray();
		n = arr.length;
		cnt = new int[n];
		for(char c : arr) cnt[c - 'a']++;
		dfs(0, "", ' ');
		System.out.print(set.size());
	}
}
