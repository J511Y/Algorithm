package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12946
// 하노이의 탑
import java.util.*;
public class prgmers_12946 {
	static int idx = 0;
	static int[][] answer;
	static void hanoi(int n, int from, int to, int aux){
		if(n == 1) {
			answer[idx++] = new int[] {from, to};
			return;
		}
		hanoi(n-1, from, aux, to);
		answer[idx++] = new int[] {from, to};
		hanoi(n-1, aux, to, from);
	}
	static public int[][] solution(int n) {
        answer = new int[(int)Math.pow(2, n) - 1][2];
        hanoi(n, 1, 3, 2);
        return answer;
    }
	public static void main(String[] args) {
		int[][] answer = solution(4);
		for(int[] arr : answer) System.out.println(Arrays.toString(arr));
	}
}
