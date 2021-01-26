package baekjoon_구현;
// https://www.acmicpc.net/problem/9517
// 아이 러브 크로아티아
import java.util.*;
public class baekjoon_9517 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt() - 1, n = sc.nextInt(), time = 0;
		for(int i = 0; i < n; i++) {
			time += sc.nextInt();
			if(time >= 210) {
				System.out.println((k % 8) + 1);
				return;
			}
			k += sc.next().equals("T") ? 1 : 0;
		}
	}
}
