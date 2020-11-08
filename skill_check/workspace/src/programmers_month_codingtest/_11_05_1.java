package programmers_month_codingtest;

public class _11_05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) sum += a[i] * b[i];
        return sum;
    }
}
