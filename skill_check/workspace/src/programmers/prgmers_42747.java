package programmers;
import java.util.*;
public class prgmers_42747 {
	public static int solution(int[] citations) {
		int answer = 0;
        int len = citations.length;
        int k = 0;
        Arrays.sort(citations);

        for (int i = 0; i < len; i++) {
            k = len - i;
            if (k <= citations[i]) {
                answer = k;
                break;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [] {22, 42}));

	}

}
