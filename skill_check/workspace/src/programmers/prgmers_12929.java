package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12929
// ¿Ã¹Ù¸¥ °ýÈ£ÀÇ °¹¼ö

public class prgmers_12929 {
	static int answer = 0;
	static void func(int n, int open, int close, String str) {
		if(open == n && close == n) {
			answer++;
			System.out.println(str);
		}
		else {
			if(open < n) func(n, open + 1, close, str + "(");
			if(close < open) func(n, open, close + 1, str + ")");
		}
	}
	static public int solution(int n) {
		answer = 0;
		func(n, 0, 0, "");
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));

	}

}
