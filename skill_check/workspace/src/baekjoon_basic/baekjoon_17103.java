package baekjoon_basic;
// https://www.acmicpc.net/problem/17103
// °ñµå¹ÙÈå ÆÄÆ¼¼Ç
import java.util.*;
class baekjoon_17103{
	static List<Integer> primes = new ArrayList<>();
	static boolean[] primearr = new boolean[1000001];
	static {
		for(int i = 2; i < 1000001; i++){
			boolean prime = true;
			for(int j = 2; j < (int)Math.sqrt(i) + 1; j++){
				if(i % j == 0){
					prime = false; break;
				}
			}
			if(prime) {
				primearr[i] = true;
				primes.add(i);
			}
		}
	}
	static int find(int n){
		int cnt = 0;
		for(int i = 0; primes.get(i) <= n / 2; i++){
//			System.out.println(n+", " + primes.get(i) + ", " + primearr[n - primes.get(i)]);
			if(primearr[n - primes.get(i)]) cnt++;
		}
		return cnt;
	}
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) System.out.println(find(sc.nextInt()));
	}
}
