package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/1831
// 4´Ü °íÀ½

public class prgmers_1831 {
	static public int solution(int n) {
        int answer = 0;
        answer = func(n, 1, 0);
        return answer;
    }
	static int func(int n, int val, int plus) {
		System.out.println(val + ", " + plus + ", rst :" + (val + plus));
		if(val > n) return 0;
		if(val * 3 + plus + 2 == n) return 1;
		int cnt = 0;
		cnt += func(n, val * 3, plus + 2);
		cnt += func(n, val * 3 + 1, plus + 1);
		cnt += func(n, val * 3 + 2, plus);
		return cnt;
	}
	public static void main(String[] args) {
//		System.out.println(solution(15));
//		System.out.println(solution(24));
		System.out.println(solution(41));
	}
}
