package baekjoon_binary_search;

import java.util.*;
public class baekjoon_2428 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(), cnt = 0;
//		int[] arr = new int[n];
//		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
//		Arrays.sort(arr);
//		int left = 0, right = 0;
//		while(left < n) {
//			while(right < n && arr[right] * 0.9d <= arr[left]) right++;
//			System.out.println(left + ", " + right);
//			cnt += right - left - 1;
//			left++;
//		}
//		System.out.println(cnt);
		String s = "ABC#CDD#";
		StringTokenizer st = new StringTokenizer(s, "[ABCDEFG]#?", true);
		String[] arr = new String[st.countTokens()];
		for(int i = 0; i < arr.length; i++) arr[i] = st.nextToken();
		System.out.println(Arrays.toString(arr));
	}
}
