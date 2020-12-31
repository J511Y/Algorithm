package goodbyeBaekjoon2020;

import java.util.*;
import java.io.*;
public class Problem2 {
	static int[][] wh = {{0, 1, 0, -1}, {1, 0, -1, 0}};
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, tc;
	public static void main(String[] args) {
		tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			n = sc.nextInt();
			int min = 8;
			int[] arr = new int[n];
			Map<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				String s = sc.next();
				arr[i] = mbtiToBit(s);
				map.put(s, map.getOrDefault(s, 0) + 1);
			}
			Arrays.sort(arr);
			if(map.values().stream().anyMatch(a -> a > 2)) min = 0;
			for(int i = 0; i < n && min > 0; i++) {
				for(int j = i + 1; j < n; j++) {
					for(int k = j + 1; k < n; k++) {
						int a = arr[i], b = arr[j], c = arr[k];
						int sum = bitCount(a ^ b) + bitCount(b ^ c) + bitCount(a ^ c);
						if(sum < min) min = sum;
					}
				}
			}
			System.out.println(min);
		}
	}
	static int bitCount(int i) {
		return Integer.bitCount(i);
	}
	static int mbtiToBit(String s) {
		char[] arr = s.toCharArray();
		int rst = 0;
		if(arr[0] == 'I') rst |= 1 << 3;
		if(arr[1] == 'N') rst |= 1 << 2;
		if(arr[2] == 'T') rst |= 1 << 1;
		if(arr[3] == 'P') rst |= 1;
		return rst;
	}
}
