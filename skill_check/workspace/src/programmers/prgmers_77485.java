package programmers;

import java.util.*;
public class prgmers_77485 {
	class Solution {
	    int r, c;
	    int[][] map;
	    int spin(int[] query) {
	        int rs = query[0] - 1, re = query[2] - 1, cs = query[1] - 1, ce = query[3] - 1, min = r * c;
	        Deque<Integer> dq = new LinkedList<>();
	        // 위부터 시계방향
	        for(int i = cs; i <= ce; i++) dq.add(map[rs][i]);
	        for(int i = rs + 1; i < re; i++) dq.add(map[i][ce]);
	        for(int i = ce; i >= cs; i--) dq.add(map[re][i]);
	        for(int i = re - 1; i > rs; i--) dq.add(map[i][cs]);
	        
	        // 가장 마지막에 들어온 값을 맨 앞에 위치해줌
	        dq.addFirst(dq.pollLast());
	        
	        // 똑같이 해줌
	        for(int i = cs; i <= ce; i++) min = Math.min(min, map[rs][i] = dq.pollFirst());
	        for(int i = rs + 1; i < re; i++) min = Math.min(min, map[i][ce] = dq.pollFirst());
	        for(int i = ce; i >= cs; i--) min = Math.min(min, map[re][i] = dq.pollFirst());
	        for(int i = re - 1; i > rs; i--) min = Math.min(min, map[i][cs] = dq.pollFirst());
	        return min;
	    }
	    public int[] solution(int rows, int columns, int[][] queries) {
	        r = rows;
	        c = columns;
	        map = new int[r][c];
	        for(int i = 0; i < r; i++) {
	            for(int j = 0; j < c; j++) {
	                map[i][j] = c * i + j + 1;
	            }
	        }
	        
	        int[] answer = new int[queries.length];
	        for(int i = 0; i < queries.length; i++) answer[i] = spin(queries[i]);
	        return answer;
	    }
	}
}
