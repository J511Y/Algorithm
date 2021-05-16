package programmers;

public class prgmers_76501 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0, len = signs.length;
        for(int i = 0; i < len; i++) answer += absolutes[i] * (signs[i] ? 1 : -1);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
