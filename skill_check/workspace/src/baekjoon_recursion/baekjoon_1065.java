package baekjoon_recursion;
// https://www.acmicpc.net/problem/1065
// ÇÑ¼ö
public class baekjoon_1065 {
	static int cnt = 0;
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		recursion(n);
		System.out.print(cnt);
	}
	static void recursion(int n) {
		if(n < 100) cnt += n;
		else if(n == 1000) recursion(n - 1);
		else {
			byte[] arr = (n + "").getBytes();
			if(arr[0] - arr[1] == arr[1] - arr[2]) cnt++;
			recursion(n - 1);
		}
	}
}
