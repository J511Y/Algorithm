package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42886
// Àú¿ï
import java.util.*;
public class prgmers_42886 {
	public int solution(int[] weight) {
        Arrays.sort(weight);
        int answer = weight[0];
        for(int i = 1; i < weight.length; i++){
            if(weight[i] > answer + 1) break;
            answer += weight[i];
        }
        return answer + 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
