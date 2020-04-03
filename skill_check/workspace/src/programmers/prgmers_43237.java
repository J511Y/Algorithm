package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/43237
// ¿¹»ê
import java.util.*;
public class prgmers_43237 {
	long sum(int[] budgets, int limit){
        long result = 0;
        for(int i : budgets) result += i > limit ? limit : i;
        return result;
    }
    public int solution(int[] budgets, int M) {
        long sum = sum(budgets, 100000);
        if(sum <= M) return Arrays.stream(budgets).max().getAsInt();
        int answer = 0, left = 1, right = 1 << 30;
        while(left <= right){
            int mid = (left / 2) + (right / 2);
            sum = sum(budgets, mid);
            if(sum <= M){
                left = mid + 1;
                answer = Math.max(answer, mid);
            }else right = mid - 1;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
