package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
// ���� ����ǥ

public class prgmers_12985 {
	static public int solution(int n, int a, int b){
        int answer = 1;
        while((a + 1) / 2 != (b + 1) / 2) {
        	a = (a + 1) / 2;
        	b = (b + 1) / 2;
        	answer++;
        }

        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(8, 4, 7));
		System.out.println(solution(8, 1, 3));
		System.out.println(solution(8, 2, 3));
	}
}
