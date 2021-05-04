package programmers;

import java.util.*;
public class prgmers_49190 {
	class Solution {
	    int[][] dis = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
	    Set<String> edges = new HashSet<>(), nodes = new HashSet<>();
	    String getStr(int ... arr) {
	        return Arrays.toString(arr);
	    }
	    public int solution(int[] arrows) {
	        int answer = 0, x = 0, y = 0;
	        nodes.add(getStr(x, y));
	        for(int i : arrows) {
	            int xp = dis[i][0], yp = dis[i][1];
	            for(int j = 0; j < 2; j++) {
	                int nx = x + xp, ny = y + yp;
	                boolean edge_exist = edges.add(getStr(x, y, nx, ny)) | edges.add(getStr(nx, ny, x, y));
	                boolean node_exist = nodes.add(getStr(nx, ny));
	                if(node_exist == false && edge_exist) answer++;
	                x = nx;
	                y = ny;
	            }
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
