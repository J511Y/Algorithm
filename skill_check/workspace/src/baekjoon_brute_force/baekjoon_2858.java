package baekjoon_brute_force;
// https://www.acmicpc.net/problem/2858
// ±â¼÷»ç ¹Ù´Ú
import java.util.*;
public class baekjoon_2858 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), w = sc.nextInt(), sum = l + w;
		for(int i = 3; i < sum; i++) {
			if(sum % i == 0 && (((sum / i) - 2) * (i - 2)) == w) {
				System.out.println((sum / i) + " " + i);
				break;
			}
		}
	}
}
