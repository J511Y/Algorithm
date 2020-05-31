package baekjoon_DP;
// https://www.acmicpc.net/problem/6359
// 만취한 상범
import java.util.*;
public class baekjoon_6359 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		boolean[] arr = new boolean[101];
		for(int i = 1; i < 101; i++) {
			for(int j = i; j < 101; j += i) arr[j] = !arr[j]; 
		}
		for(int i = 0; i < tc; i++) {
			int n = sc.nextInt(), cnt = 0;
			for(int j = 1; j <= n; j++) if(arr[j]) cnt++;
			System.out.println(cnt);
		}
	}
}
