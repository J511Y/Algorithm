package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/1830
// 브라이언의 고민
import java.util.*;
public class prgmers_1830 {
	static Set<Character> set = new HashSet<>();
	static boolean isLower(char c) {
		return 'a' <= c && c <= 'z';
	}
	static String check(String s) {
		String result = "";
		char[] arr = s.toCharArray();
		char c = arr[1];
		if(set.contains(c)) return "invalid";
		set.add(c);
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				if(arr[i] != c) return "invalid";
			}else result += arr[i];
		}
		return result;
	}
	static public String solution(String sentence) {
		int len = sentence.length();
		char[] arr = sentence.toCharArray();
		int[] cnt = new int[26];
		for(char c : arr) if(isLower(c)) arr[c - 'a']++;
        String answer = "";
        for(int i = 0; i < len; i++) {
        	if(isLower(arr[i])) {
        		if(cnt[arr[i] - 'a'] == 2) {
        			
        		}
        	}else {
        		
        	}
        }
        return answer.trim();
    }
	public static void main(String[] args) {
		System.out.println(solution("HaEaLaLaObWORLDb"));
		System.out.println(solution("SpIpGpOpNpGJqOqA"));
		System.out.println(solution("AxAxAxAoBoBoB")); // invalid
		System.out.println(solution("AxAeAxAoBoBoB")); // invalid
		System.out.println(solution("AxAxAxAoBoBoxBx")); // invalid
		System.out.println(solution("AxAxAxAoBeBocBc")); // AAAA BB B
		
	}
}
