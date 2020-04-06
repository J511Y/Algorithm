package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12936?language=java
// �� ���� ���
import java.util.*;
public class prgmers_12936 {
	static long[] fact = new long[21];
    static{
        long f = 1;
        for(int i = 1; i < 21; i++){
            f *= i;
            fact[i] = f;
        }
    }
    public int[] solution(int n, long k) {
        k--;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) list.add(i);
        int[] answer = new int[n];
        int idx = 0;
        for(long i = n - 1; i > 0; i--){
            long mok = k / fact[(int)i];
            answer[idx++] = list.get((int)mok);
            list.remove((int)mok);
            k %= fact[(int)i];
        }
        answer[idx] = list.get(0);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
