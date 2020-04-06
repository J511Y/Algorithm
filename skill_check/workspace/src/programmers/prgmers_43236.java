package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/43236
// Â¡°Ë´Ù¸®
import java.util.*;
public class prgmers_43236 {
	public static int solution(int distance, int[] rocks, int n) {
        int len = rocks.length, left = 1, right = 1 << 30, max = 0;
        int[] nrocks = new int[len + 2];
        nrocks[len] = distance;
        for(int i = 0; i < len; i++) nrocks[i] = rocks[i];
        Arrays.sort(nrocks);
        while(left <= right){
            int[] temp = Arrays.copyOf(nrocks, len + 2);
            int mid = (left / 2) + (right / 2), cnt = 0;
            for(int i = 0; i < len; i++) {
                if((temp[i+1] - temp[i]) < mid){
                    cnt++;
                    temp[i+1] = temp[i];
                }
            }
            if(cnt > n){
                right = mid - 1;
            }else{
                max = Math.max(max, mid);
                left = mid + 1;
            }
            
        }
        return max;
    }
	public static void main(String[] args) {
		System.out.println(solution(25, new int[] {2, 14, 11, 21, 17}, 2));

	}

}
