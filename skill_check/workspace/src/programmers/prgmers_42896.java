package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42896
// 카드 게임
public class prgmers_42896 {
	static public int solution(int[] left, int[] right) {
		int llen = left.length, rlen = right.length;
        int[][] dp = new int[llen + 1][rlen + 1];
        for(int i = llen - 1; i >= 0; i--) {
        	for(int j = rlen - 1; j >= 0; j--) {
        		if(left[i] > right[j]) dp[i][j] = dp[i][j+1] + right[j];
        		else dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]);
        	}
        }
        return dp[0][0];
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 2, 5}, new int[] {2, 4, 1}));
		System.out.println(solution(new int[] {3, 2, 4}, new int[] {2, 4, 1}));
		System.out.println(solution(new int[] {3, 3, 1}, new int[] {7, 7, 1}));
		System.out.println(solution(new int[] {1, 1, 1, 1, 3}, new int[] {2, 3, 1, 1, 1}));
	}

}
