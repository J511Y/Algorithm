package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42627?language=java
// 디스크 컨트롤러
import java.util.*;
public class prgmers_42627 {
	static public int solution(int[][] jobs) {
		int answer = 0, time = 0;
        Arrays.sort(jobs, (a, b)->{return (a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]);});
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            return a[1] - b[1];
        });
        for(int i = 0; i < jobs.length; i++){
        	if(time >= jobs[i][0]) {
        		pq.add(jobs[i]);
        	}else{
                if(!pq.isEmpty()) {
                    int[] poll = pq.poll();
                    time += poll[1];
                    answer += time - poll[0];
                    i--;
                }else {
                    time = jobs[i][0] + jobs[i][1];
                    answer += time - jobs[i][0];
                }
            }
        }
        while(!pq.isEmpty()){
            int[] poll = pq.poll();
            time += poll[1];
            answer += time - poll[0];
        }
        return answer / jobs.length;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{0, 3}, {1, 9}, {1, 1}, {2, 6}}));

	}
}
