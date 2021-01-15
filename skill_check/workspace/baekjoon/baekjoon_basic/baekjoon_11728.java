package baekjoon_basic;
// https://www.acmicpc.net/problem/11728
// 배열 합치기
/*
 * 간단한 문제인줄 알았는데 퀵소트가 안먹히더랑
 * 머지소트로 해결
 */
import java.util.*;
import java.io.*;
public class baekjoon_11728 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
		int[] aArr = new int[a], bArr = new int[b];
		aArr = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		bArr = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		int A = 0, B = 0;
		while(A < a && B < b) {
			sb.append((aArr[A] < bArr[B] ? aArr[A++] : bArr[B++]) + " ");
		}
		while(A < a) sb.append(aArr[A++] + " ");
		while(B < b) sb.append(bArr[B++] + " ");
		System.out.println(sb.toString());
	}
}
