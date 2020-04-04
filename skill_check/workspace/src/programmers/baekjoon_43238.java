package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/43238?language=java
// 입국심사
public class baekjoon_43238 {
	public static long solution(int n, int[] times) {
		long left = 1, right = 1000000000l * 1000000000l, answer = right;
        while(left <= right){
            long mid = (left + right) / 2, finish = 0;
            for(long i : times) finish += mid / i;
            if(finish < n) left = mid + 1;
            else {
            	answer = Math.min(answer, mid);
            	right = mid - 1;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(6, new int[] {7, 10}));
		System.out.println(solution(2, new int[] {7, 10}));
		System.out.println(solution(4, new int[] {7, 10}));
		System.out.println(solution(10, new int[] {1, 5}));
		System.out.println(solution(1000000000, new int[] {1, 1000000000, 1000000000}));
		System.out.println(solution(3, new int[] {1000000000, 1000000000, 1000000000}));
//		System.out.println(1000000000l * 1000000000l);
	}
}
