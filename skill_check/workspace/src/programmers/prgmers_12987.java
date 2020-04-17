package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12987
// 숫자 게임
import java.util.*;
public class prgmers_12987 {
	public int solution(int[] A, int[] B) {
        int answer = 0, len = A.length, a = 0, b = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        while(a < len && b < len){
            if(A[a] < B[b]){
                a++;
                answer++;
            }
            b++;
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
