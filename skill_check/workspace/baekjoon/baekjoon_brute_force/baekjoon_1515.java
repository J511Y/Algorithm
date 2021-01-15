package baekjoon_brute_force;
// https://www.acmicpc.net/problem/1515
// 수 이어 쓰기
public class baekjoon_1515 {
	public static void main(String[] args) {
		char[] arr = new java.util.Scanner(System.in).next().toCharArray();
		int idx = 0, i = 1;
		for(; idx < arr.length; i++) {
			char[] num = ("" + i).toCharArray();
			for(int j = 0; j < num.length && idx < arr.length; j++) idx += arr[idx] == num[j] ? 1 : 0;
		}
		System.out.print(i - 1);
	}
}
