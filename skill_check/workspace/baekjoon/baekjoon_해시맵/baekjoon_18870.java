package baekjoon_ÇØ½Ã¸Ê;

import java.util.*;
import java.io.*;
public class baekjoon_18870 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Int(br.readLine()), idx = 0;
		int[] arr = new int[n], tmp = new int[n];
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < n; i++) tmp[i] = arr[i] = Int(input[i]);
		Arrays.sort(tmp);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : tmp) if(!map.containsKey(i)) map.put(i, idx++);
		for(int i : arr) sb.append(map.get(i) + " ");
		System.out.print(sb.toString().trim());
	}
}
