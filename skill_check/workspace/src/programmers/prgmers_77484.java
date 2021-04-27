package programmers;

import java.util.*;
public class prgmers_77484 {
	class Solution {
	    int rank(int i) {
	        return i < 2 ? 6 : (7 - i);
	    }
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int zero = 0, cnt = 0;
	        Set<Integer> wins = new HashSet<>();
	        for(int i : win_nums) wins.add(i);
	        for(int lotto : lottos) {
	            zero += lotto == 0 ? 1 : 0;
	            cnt += wins.contains(lotto) ? 1 : 0;
	        }
	        return new int[]{rank(zero + cnt), rank(cnt)};
	    }
	}
}
