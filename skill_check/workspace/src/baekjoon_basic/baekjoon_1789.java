package baekjoon_basic;
// https://www.acmicpc.net/problem/1789
// 수들의 합
public class baekjoon_1789 {
	public static void main(String[] ar){
		long s = new java.util.Scanner(System.in).nextLong(), i = 0;
		while(++i > 0) if(((i + 1) * i / 2) > s) break;
		System.out.println(i - 1);
	}
}
