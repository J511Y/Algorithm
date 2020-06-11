package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12983
// ´Ü¾î ÆÛÁñ
public class prgmers_12983 {
	static int min = 1 << 30;
	static void func(String[] strs,int[] lens, String t, int cnt) {
		if(cnt > min) return;
		if(t.equals("")) min = Math.min(min, cnt);
		else {
            for(int i = 0; i < lens.length; i++) {
				if(t.startsWith(strs[i])) func(strs, lens, t.substring(lens[i]), cnt + 1);
			}
		}
	}
	static public int solution(String[] strs, String t) {
		int[] lens = new int[strs.length];
		Arrays.sort(strs, (a, b)->{return b.length() - a.length();});
		System.out.println(Arrays.toString(strs));
        for(int i = 0; i < strs.length; i++) lens[i] = strs[i].length();
        func(strs, lens, t, 0);
        return min == 1 << 30 ? -1 : min;
    }
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"ba","n","na","a"}, "banana"));

	}

}
