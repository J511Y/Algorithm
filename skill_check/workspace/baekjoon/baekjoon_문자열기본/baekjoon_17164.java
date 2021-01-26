package baekjoon_문자열기본;
// https://www.acmicpc.net/problem/17164
// 레인보우 비즈
import java.util.*;
public class baekjoon_17164 {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		sc.nextInt();
		String[] input = sc.next().split("V");
		int max = 1;
		for(String s : input) {
			byte[] arr = s.getBytes();
			int cnt = 1;
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] != arr[i-1]) cnt++;
				else {
					max = Math.max(cnt, max);
					cnt = 1;
				}
			}
			max = Math.max(cnt, max);
		}
		System.out.println(max);
	}
}
