package programmers;
import java.util.*;
public class prgmers_43162 {
	public static int[] solution(int n, String[] words) {
		Set<String> set = new HashSet<>();
		set.add(words[0]);
        for(int i=1; i<words.length; i++) {
        	String s1 = words[i - 1];
        	String s2 = words[i];
        	if(s1.charAt(s1.length() - 1) != s2.charAt(0) || set.contains(s2)) {
        		return new int [] {(i % n) + 1, (i / n) + 1};
        	}
        	set.add(s2);
        }
        return new int [] {0,0};
    }
	static int[] vst;
	static void dfs(int[][] net, int i, int max) {
		vst[i] = max;
		for(int j=0; j<net.length; j++)
			if(vst[j] == 0 && net[i][j] == 1)
				dfs(net, j, max);
	}
	public static int solution(int n, int[][] computers) {
        vst = new int [n];
        int max = 1;
        for(int i=0; i<n; i++)
        	if(vst[i] == 0)
        		dfs(computers, i, max++);
        return Arrays.stream(vst).max().getAsInt();
    }
	public static void main(String[] args) {
		for(int i : solution(2, new String [] {"hello", "one", "even", "never", "now", "world", "draw"}))
			System.out.println(i);
	}
}
