package baekjoon_basic;
// https://www.acmicpc.net/problem/2960
// 에라토스테네스의 체
import java.util.*;
public class baekjoon_2960 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), cnt = 0;
		boolean[] arr = new boolean[1001];
		for(int i = 2; i <= n; i++) {
			int j = i;
			while(j <= n) {
				if(!arr[j]) {
					cnt++;
					if(cnt == k) {
						System.out.println(j);
						return;
					}
					arr[j] = true;					
				}
				j += i;
			}
		}
	}
}
