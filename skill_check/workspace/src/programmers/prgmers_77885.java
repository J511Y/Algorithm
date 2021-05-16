package programmers;

public class prgmers_77885 {
	public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0;
        for(long n : numbers) {
            int i = 0;
            while((n & (1l << i)) != 0) i++;
            long m = 1l << i;
            answer[idx++] = i == 0 ? n + 1 : (n + (m >> 1));
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
