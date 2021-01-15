package baekjoon_math;

import java.io.*;
import java.util.*;
public class baekjoon_14919 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			double d = Double.parseDouble(st.nextToken()) + 0.00000001;
			arr[(int)(d * 1000000)]++;
		}
		for(int i : arr) System.out.print(i + " ");
	}
}
