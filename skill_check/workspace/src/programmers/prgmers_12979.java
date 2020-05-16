package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12979
// 기지국 설치
public class prgmers_12979 {
	static public int solution(int n, int[] stations, int w) {
        int answer = 0, start = 0, cover = w * 2 + 1;
        for(int i : stations) {
        	int cnt = i - w - 1 - start;
        	start = i + w;
        	if(cnt <= 0) continue;
        	answer += (cnt / cover) + (cnt % cover > 0 ? 1 : 0);
        }
        int cnt = n - start;
    	if(cnt > 0) answer += (cnt / cover) + (cnt % cover > 0 ? 1 : 0);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(11, new int[] {4, 11}, 1));
		System.out.println(solution(16, new int[] {9}, 2));
	}

}
