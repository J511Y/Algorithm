package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42897
// µµµÏÁú
public class prgmers_42897 {
	static public int solution(int[] money) {
        int n = money.length;
        int[] dp1 = new int[n], dp2 = new int[n];
        dp1[0] = money[0];
        dp1[1] = money[0];
        dp2[1] = money[1];
        for(int i = 2; i < n; i++) {
        	if(i < n - 1) dp1[i] = Math.max(dp1[i-2] + money[i],dp1[i-1]);
        	dp2[i] = Math.max(dp2[i-2] + money[i],dp2[i-1]);
        }
        System.out.println(Arrays.toString(dp1));
        System.out.println(Arrays.toString(dp2));
        return Math.max(dp1[n-2], dp2[n-1]);
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 1}));
		System.out.println(solution(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3}));
		System.out.println(solution(new int[] {1,1,1,1,1,1,1,1,1,1,1}));
		System.out.println(solution(new int[] {10, 2, 2, 100, 2}));

	}

}
