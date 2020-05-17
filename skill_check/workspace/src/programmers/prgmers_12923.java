package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12923
// 숫자 블록

public class prgmers_12923 {
	static public int[] solution(int begin, int end) {
        int[] answer = new int[end - begin + 1];
        int idx = 0;
        for(int i = begin; i <= end; i++) {
        	int mok = i;
        	for(int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
        		if(i % j == 0 && i / j <= 10000000) {
        			mok = j;
        			break;
        		}
        	}
        	answer[idx++] = i == 1 ? 0 : (i / mok);
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 10)));
//		System.out.println(Arrays.toString(solution(999999000, 1000000000)));
		System.out.println(Arrays.toString(solution(999999999, 1000000000)));

	}
}
