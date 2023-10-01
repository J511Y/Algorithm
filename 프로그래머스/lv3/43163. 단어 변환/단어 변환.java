import java.util.*;
class Solution {
    static boolean comp(String a, String b) {
		int cnt=0;
		for(int i=0; i<a.length(); i++)
			if(a.charAt(i) != b.charAt(i)) cnt++;
		return cnt == 1;
	}
	public int solution(String begin, String target, String[] words) {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int rnd = 1, idx = 0;
        boolean[] vst = new boolean[words.length];
        for(String s : words) {
        	if(comp(begin, s)) {
        		q1.add(s); q2.add(rnd); vst[idx] = true;
        	}
        	idx++;
        }
        while(!q1.isEmpty()) {
        	String s = q1.poll();
        	int x = q2.poll();
        	if(s.equals(target)) return x;
        	for(int i=0; i<words.length; i++) {
        		if(vst[i]) continue;
        		if(comp(s, words[i])) {
        			q1.add(words[i]); q2.add(x+1); vst[i] = true;
        		}
        	}
        }
        return 0;
    }
}