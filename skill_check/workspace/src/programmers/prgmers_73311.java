package programmers;

public class prgmers_73311 {
	public static int solution(int n) {
        if(n % 2 == 1) return 0;
        if(n < 3) return n + 1;
        long[] arr = new long [5001];
        arr[0] = 1; arr[2] = 3;
        for(int i = 4; i <= n; i += 2) {
        	arr[i] = arr[i-2] * 3;
        	for(int j = 4; j <= i; j += 2) {
        		arr[i] += arr[i - j] * 2;
        	}
        	arr[i] %= 1000000007;
        }
        return (int)arr[n];
    }
	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(6));
		System.out.println(solution(8));

	}

}
