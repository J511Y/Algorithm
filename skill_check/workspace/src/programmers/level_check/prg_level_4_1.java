package programmers.level_check;

public class prg_level_4_1 {
	static public int solution(String[] arr) {
        int len = (arr.length + 1) / 2;
        int[][] max = new int[200][200], min = new int[200][200];
        for(int i = 0; i < 40000; i++) {
        	max[i/200][i%200] = -1000000;
        	min[i/200][i%200] = 1000000;
        }
        for(int i = 0; i < len; i++) max[i][i] = min[i][i] = Integer.parseInt(arr[i * 2]);
        for(int dp = 1; dp < len; dp++) {
        	for(int i = 0; i < len - dp; i++) {
        		int j = dp + i;
        		for(int k = 0; k < j; k++) {
        			if(arr[k*2+1].equals("-")) {
        				max[i][j] = Math.max(max[i][j], max[i][k] - min[k+1][j]);
        				min[i][j] = Math.min(min[i][j], min[i][k] - max[k+1][j]);
        			}else {
        				max[i][j] = Math.max(max[i][j], max[i][k] + max[k+1][j]);
        				min[i][j] = Math.min(min[i][j], min[i][k] + min[k+1][j]);
        			}
        		}
        	}
        }
        return max[0][len - 1];
    }
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"1", "-", "3", "+", "5", "-", "8"}));
		System.out.println(solution(new String[] {"5", "-", "3", "-", "1", "+", "2", "-", "4"}));

	}

}