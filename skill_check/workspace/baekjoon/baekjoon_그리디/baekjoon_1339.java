package baekjoon_±×¸®µð;

import java.util.*;
public class baekjoon_1339 {
	static String[] arr;
	static char[] carr = new char[10];
	static boolean[] vst;
	static int s, max = 0;
	static void func(int cnt, int[] seq) {
		if(cnt == s) {
			Map<Character, Integer> map = new HashMap<>();
			for(int i = 0; i < s; i++) map.put(carr[seq[i]], 9 - i);
			int sum = 0;
			for(String str : arr) {
				int tmp = 0;
				for(char c : str.toCharArray())tmp = (tmp * 10) + map.get(c);
				sum += tmp;
			}
			max = Math.max(sum, max);
			return;
		}
		for(int i = 0; i < s; i++) {
			if(vst[i] == false) {
				vst[i] = true;
				seq[cnt] = i;
				func(cnt + 1, seq);
				vst[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[26];
		Arrays.fill(num, -1);
		int n = sc.nextInt(), idx = 0;
		arr = new String[n];
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
			for(char c : arr[i].toCharArray()) {
				if(!set.contains(c)) carr[idx++] = c;
				set.add(c);
			}
		}
		s = set.size();
		vst = new boolean[s];
		carr = Arrays.copyOfRange(carr, 0, s);
		func(0, new int[s]);
		
		System.out.println(max);
	}
}
