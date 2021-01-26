package baekjoon_브루트포스;
// https://www.acmicpc.net/problem/10448
// 유레카 이론
import java.util.*;
public class baekjoon_10448 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[] tri = new int[45];
		for(int i = 1; i < 45; i++) tri[i] = tri[i-1] + i;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt(), rst = 0;
			for(int a = 1; a < 45 && rst == 0; a++) {
				for(int b = 1; b < 45 && rst == 0; b++) {
					for(int c = 1; c < 45 && rst == 0; c++) {
						if(tri[a] + tri[b] + tri[c] == x) rst = 1;
					}
				}
			}
			System.out.println(rst);
		}
	}
}
