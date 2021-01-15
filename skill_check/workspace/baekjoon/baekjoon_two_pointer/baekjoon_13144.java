package baekjoon_two_pointer;

import java.io.*;
import java.util.*;
public class baekjoon_13144 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), left = 0, right = 0, answer = 0;
		int[] arr = new int[n], cnt = new int[100001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		while(right < n) {
			int l = arr[left], r = arr[right];
			if(cnt[r] > 0) {
				cnt[l]--;
				answer += right - left;
				left++;
			} else {
				cnt[r]++;
				right++;
			}
		}
		int cha = right - left;
		System.out.println(answer + (cha * (cha + 1) / 2));
	}
}
