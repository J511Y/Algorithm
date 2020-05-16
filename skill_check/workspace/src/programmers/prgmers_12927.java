package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12927
// 야근 지수
import java.util.*;
public class prgmers_12927 {
	static public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> {return (int) (b - a);});
        for(int i : works) pq.add((long)i);
        while(n-->0 && pq.peek() > 0) pq.add(pq.poll() - 1);
        while(!pq.isEmpty()) answer += Math.pow(pq.poll(), 2);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(4, new int[] {4, 3, 3}));
		System.out.println(solution(1, new int[] {2, 1, 2}));
		System.out.println(solution(3, new int[] {1, 1}));

	}

}
