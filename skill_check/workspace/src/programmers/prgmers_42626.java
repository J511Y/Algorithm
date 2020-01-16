package programmers;
import java.util.*;
public class prgmers_42626 {
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville) pq.add(i);
        while(pq.peek() < K) {
        	pq.add(pq.poll() + (pq.poll() * 2));
        	answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [] {1, 2, 6}, 11));

	}

}
