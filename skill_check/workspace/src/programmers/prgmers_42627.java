package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42627?language=java
// 디스크 컨트롤러
import java.util.*;
public class prgmers_42627 {
	public int solution(int[][] jobs) {
        int answer = 0, time = 0;
        Arrays.sort(jobs);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            return a[1] - b[1];
        });
        for(int i = 0; i < jobs.length || !pq.isEmpty(); i++){
        	if(i < jobs.length) {
        		int[] job = jobs[i];
        		if(time <= job[0]) {
        			pq.add(job);
        			time += job[0];
        			continue;
        		}        		
        	}
            if(!pq.isEmpty()) {
            	int[] poll = pq.poll();
            	answer += poll[1] + time - poll[0];
            }else {
            	time = jobs[i][0];
            }
        }
        return answer / jobs.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
