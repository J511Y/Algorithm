package programmers_stack_queue;
import java.util.*;
/*
 * 이 문제도 스택을 몰랐던 때라서 반복문으로 풀었습니다.
 * 스택을 사용한 풀이는 solution2를 보시면 됩니다.
 * 충격적인건 이중포문이 더 시간이 짧게 걸렸어요...어떻게 된거죠
 */
public class prgmers_42854 {
	public static int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        for(int i = 0; i < prices.length; i++) {
        	int ref = prices[i];
        	int input = 0;
        	for(int j = i + 1; j < prices.length; j++) {
        		input++;
        		if(ref <= prices[j]) continue;
        		else break;
        	}
        	answer[i]=input;
        }
        return answer;
    }
	
	public static int[] solution2(int[] prices) {
		int len = prices.length;
		int[] answer = new int [len];
		for(int i = 0; i < len; i++) answer[i] = len - i - 1; // 값 역순으로 초기화
		Stack<int[]> stack = new Stack<>();
		for(int i = 0; i < len; i++) {
			// 스택이 비지 않았고 스택 맨 위의 값이 현재 배열에서 참조하는 값보다 큰 경우
			while(0 < stack.size() && stack.peek()[0] > prices[i]) { 
				// 맨 위의 값을 빼버리고 몇 초간 유지했는지 answer에 넣어줌.
				int[] arr = stack.pop();
				answer[arr[1]] = i - arr[1];
			}
			stack.push( new int [] {prices[i], i}); // 값과 인덱스를 가지는 배열을 넣어줌.			
		}
		return answer;
	}
	public static void main(String[] args) {
		for(int i : solution(new int [] {1, 2, 3, 2, 3})) System.out.print(i + " ");
		System.out.println();
		
		for(int i : solution2(new int [] {1, 2, 3, 2, 3})) System.out.print(i + " ");
		System.out.println();
	}
}
/*
주식가격
문제 설명
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
입출력 예 설명
1초 시점의 1은 끝까지 가격이 떨어지지 않았습니다.
2초 시점의 2은 끝까지 가격이 떨어지지 않았습니다.
3초 시점의 3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
4초 시점의 2은 1초간 가격이 떨어지지 않았습니다.
5초 시점의 3은 0초간 가격이 떨어지지 않았습니다.
*/