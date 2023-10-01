import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> (int) (b - a));
        for(int i : works) pq.add((long)i);
        while(n-->0 && pq.peek() > 0) pq.add(pq.poll() - 1);
        while(!pq.isEmpty()) answer += Math.pow(pq.poll(), 2);
        return answer;
    }
}