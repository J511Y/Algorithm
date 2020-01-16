package programmers;
import java.util.*;
public class prgmers_42842 {
	public static int[] solution(int brown, int red) {
        int sum = brown + red;
        for(int i=3; i<sum/2; i++) {
        	if(sum % i == 0) {
        		int min = i;
        		int max = sum / i;
        		if((min-2) * (max-2) == red) return new int [] {max, min};
        	}
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(10, 2)));
		System.out.println(Arrays.toString(solution(8, 1)));
		System.out.println(Arrays.toString(solution(24, 24)));
	}

}
