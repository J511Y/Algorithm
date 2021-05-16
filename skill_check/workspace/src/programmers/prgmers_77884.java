package programmers;

import java.util.*;
public class prgmers_77884 {
	class Solution {
	    int yaksu(int x) {
	        if(x == 1) return 1;
	        Set<Integer> set = new HashSet<>();
	        for(int i = 1; i <= x / 2; i++) {
	            if(x % i == 0) {
	                set.add(i);
	                set.add(x / i);
	            }
	        }
	        return set.size();
	    }
	    public int solution(int left, int right) {
	        int answer = 0;
	        for(; left <= right; left++) answer += left * (yaksu(left) % 2 == 0 ? 1 : -1);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
