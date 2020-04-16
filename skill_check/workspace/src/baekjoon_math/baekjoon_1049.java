package baekjoon_math;
// https://www.acmicpc.net/problem/1049
// ±‚≈∏¡Ÿ
import java.util.*;
public class baekjoon_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), pack = 1000, piece = 1000, amount = 0;
		for(int i = 0; i < m; i++){
			pack = Math.min(pack, sc.nextInt());
			piece = Math.min(piece, sc.nextInt());
		}
		while(n >= 6){
			amount += pack < (piece * 6) ? pack : (piece * 6);
			n -= 6;
		}
		amount += pack < (piece * n) ? pack : (piece * n);
		System.out.println(amount);
	}
}
