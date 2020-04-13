package baekjoon_math;
// https://www.acmicpc.net/problem/1748
// 수 이어 쓰기 1
class baekjoon_1748{
	public static void main(String[] ar){
		int n = new java.util.Scanner(System.in).nextInt();
        long cnt = 0;
		for(int i = 1; i <= n; i *= 10) cnt += n - i + 1;
		System.out.println(cnt);
	}
}
