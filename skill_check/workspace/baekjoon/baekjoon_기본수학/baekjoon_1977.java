package baekjoon_기본수학;
// https://www.acmicpc.net/problem/1977
// 완전제곱수
import java.util.*;
public class baekjoon_1977 {
	static int[] pow = new int[101];
	static { for(int i = 1; i <= 100; i++) pow[i] = i * i;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), sum = 0, min = 10001;
		for(int i = 1; i < 101; i++) {
			int val = pow[i];
			if(m <= val && val <= n) {
				min = Math.min(val, min);
				sum += val;
			}
		}
		System.out.println(sum == 0 ? "-1": (sum+"\n"+min));
	}
}
