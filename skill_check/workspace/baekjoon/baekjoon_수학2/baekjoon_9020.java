package baekjoon_¼öÇÐ2;
import java.util.*;
public class baekjoon_9020 {
	static boolean[] prime = new boolean [10001];
	public static boolean isPrime(int x) {
		for(int i=2; i<(int)Math.sqrt(x) + 1; i++)
			if(x % i == 0) return false;
		return true;
	}
	static {
		for(int i=2; i<10001; i++) prime[i] = isPrime(i);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int target = sc.nextInt();
			int min = target/2;
			while(min > 0) {
				int max = target - min;
				if(prime[min] && prime[max]) {
					System.out.println(min + " " + max);
					break;
				}
				min--;
			}
		}
	}
}
