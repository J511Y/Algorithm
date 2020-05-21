package baekjoon_adhoc;
// https://www.acmicpc.net/problem/18239
// 편안한 수열 만들기
import java.util.*;
public class baekjoon_18239 {
	static void print(int type, int s, int e) {
		System.out.println((type == 0 ? "swap " : "reverse ") + s + " " + e);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		if(n == 2) System.out.print("YES\nswap 1 2\nswap 1 2\nswap 1 2\nswap 1 2\nswap 1 2");
		else if(n == 3) System.out.print("NO");
		else {
			System.out.println("YES");
			if(k == 1) {
				print(0, 1, n);
				print(1, 1, n - 1);
				print(1, 1, n - 2);
				for(int i = 0; i < 2; i++) print(1, 1, n);
			}else if(n - k == 1){
				print(0, 1, n);
				print(1, 2, n - 1);
				print(1, 2, n);
				for(int i = 0; i < 2; i++) print(1, 1, n);
			}else {
				print(1, 1, k);
				print(1, k + 1, n);
				for(int i = 0; i < 3; i++) print(1, 1, n);
			}
		}
	}
}
