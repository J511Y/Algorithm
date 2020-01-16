package programmers;
import java.util.*;
public class prgmers_43165 {
	static int answer = 0;
	static void dfs(int[] arr, int x, int idx, int val) {
		if(idx == arr.length) {
			if(x == val) answer++;
			return;
		}
		dfs(arr, x, idx + 1, val + arr[idx]);
		dfs(arr, x, idx + 1, val + (arr[idx] * -1 ));
	}
	public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        StringBuffer sb = new StringBuffer();
        while(sb.charAt(0) == '0') sb.deleteCharAt(0);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [] {1, 1, 1, 1, 1}, 3));

	}

}
