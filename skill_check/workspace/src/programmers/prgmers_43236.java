package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/43236
// Â¡°Ë´Ù¸®
import java.util.*;
public class prgmers_43236 {
	public static int solution(int distance, int[] rocks, int n) {
		int len = rocks.length, answer = 0;
        if(n == len) return distance;
        Arrays.sort(rocks);
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(25, new int[] {2, 14, 11, 21, 17}, 2));

	}

}
