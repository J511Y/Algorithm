package baekjoon_math2;
import java.util.*;
public class baekjoon_9020 {
	static List<Integer> list;
	public static boolean isPrime(int n) {
		for(int i=3; i<Math.sqrt(n)+1; i++)
			if(n%i == 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = sc.nextInt();
		while(rnd-->0) {
			list = new ArrayList<>();
			int n = sc.nextInt();
			for(int i=2; i<n; i++)
				if(isPrime(i)) list.add(i);
			int maxIdx = list.size() / 2;
			int minIdx = list.size() / 2;
			int max = list.get(maxIdx);
			int min = list.get(minIdx);
			while(max + min != n) {
				if(max + min > n) {
					if (minIdx > 0) min = list.get(--minIdx);
					else max = list.get(--maxIdx);
				}
				else max = list.get(++maxIdx);
			}
			System.out.println(min + " " + max);
		}
	}
}