import java.util.*;
class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        // max값 세팅
        int am = 0, cm = 0, pn = problems.length;
        for(int[] p : problems) {
            am = Math.max(am, p[0]);
            cm = Math.max(cm, p[1]);
        }
        // problems 재정의
        int[][] newproblems = new int[pn + 2][];
        for(int i = 0; i < pn; i++) newproblems[i] = problems[i];
        newproblems[pn] = new int[] {0, 0, 1, 0, 1};
        newproblems[pn + 1] = new int[] {0, 0, 0, 1, 1};
        problems = newproblems;
        
        // 우선순위 큐 정의
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[] { alp, cop, 0 });
        
        // dp 배열 선언
        int[][] dp = new int[am + 1][cm + 1];
        for(int[] d : dp) Arrays.fill(d, 1 << 30);
        
        while(pq.peek()[0] < am || pq.peek()[1] < cm) {
            int[] p = pq.poll();
            int a = p[0], c = p[1], t = p[2];
            for(int[] pro : problems) {
                int areq = pro[0], creq = pro[1], arwd = pro[2], crwd = pro[3], cost = pro[4];
                int na = Math.min(am, a + arwd), nc = Math.min(cm, c + crwd), ncost = t + cost;
                if (areq <= a && creq <= c && dp[na][nc] > ncost) {
                    dp[na][nc] = ncost;
                    pq.add(new int[] { na, nc, ncost });
                }
            }
        }
        return dp[am][cm];
    }
}