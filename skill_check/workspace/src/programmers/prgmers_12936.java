package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12936?language=java
// 줄 서는 방법
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
        for(int i = n - 1; i > 0; i--){
            int mok = (int)(k / fact[i]);
            answer[idx++] = list.get(mok);
            list.remove(mok);
            k %= fact[i];
        }
        answer[idx] = list.get(0);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
