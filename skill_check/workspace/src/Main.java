import java.util.*;

class Main {
	public static void main(String[] ar) {
		Main m = new Main();
		System.out.println((1 + Integer.MAX_VALUE) == Integer.MIN_VALUE);
	}
    
    static int func(int n){
    	int left = 1, right = Integer.MAX_VALUE;
    	while(left <= right){
    		int mid = (left + right) / 2;
    		// a = 1부터 mid까지의 합
    		// b = 1부터 mid + 1 까지의 합
    		int a, b;
    		
    		// 나올 수 있는 조건은 3가지
    		// n이 a 보다 작은 경우
    		// n이 b 보다 같거나 큰 경우
    		// 그 외
    		
    	}
    	return left;
    }
}