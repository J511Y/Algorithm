package baekjoon_문자열기본;

import java.util.*;
public class baekjoon_5015 {
    static char[] P, S;
    static int n, plen, slen;
    static int[][] dp;

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P = sc.next().toCharArray();
        plen = P.length;
    	n = sc.nextInt();
    	while(n--> 0) {
    		dp = new int[102][102];
    		S = sc.next().toCharArray();
    		slen = S.length;
    		if(func(0, 0) == 1) System.out.println(S);
    	}
    }

    static int func(int p, int s) {
        if (p == plen && s == slen) return 1;
        if (p >= plen) return 2;
        if (s >= slen && P[p] != '*') return 2;
        if (dp[p][s] != 0) return dp[p][s];
        if (P[p] == '*') {
            int rtn = 2;
            if(s <= slen) {
            	if (func(p + 1, s) == 1) rtn = 1;
            	if (func(p + 1, s + 1) == 1) rtn = 1;
            	if (func(p, s + 1) == 1) rtn = 1;            	
            }
            return dp[p][s] = rtn;
        }
        if (P[p] == S[s]) return dp[p][s] = func(p + 1, s + 1);
        else return dp[p][s] = 2;
    }
}
