package baekjoon_투포인터;

import java.io.*;
import java.util.*;
public class baekjoon_2295 {
	static class Value{
		int val, i, j;
		Value(int val, int i, int j) {
			this.val = val;
			this.i = i;
			this.j = j;
		}
	}
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Int(br.readLine());
		Arrays.sort(arr);
		List<Value> ab = new ArrayList<>(), dc = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				ab.add(new Value(arr[i] + arr[j], i, j));
				dc.add(new Value(arr[j] - arr[i], j, i));
			}
		}
		ab.sort((a,b) -> b.val - a.val);
		dc.sort((a,b) -> b.val - a.val);
		int i = 0, j = 0, size = ab.size(), max = Integer.MIN_VALUE;
		while(i < size && j < size) {
			Value A = ab.get(i), B = dc.get(j);
			if(A.val > B.val) i++;
			else if(B.val > A.val) j++;
			else {
				max = Math.max(max, arr[B.i]);
				if(i < j) i++;
				else j++;
			}
		}
		System.out.println(max);
	}
}
