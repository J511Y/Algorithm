package baekjoon_�⺻;
// https://www.acmicpc.net/problem/5988
// Ȧ���ϱ� ¦���ϱ�
import java.util.*;
public class baekjoon_5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			byte[] arr = sc.next().getBytes();
			System.out.println(arr[arr.length - 1] % 2 == 0 ? "even" : "odd");
		}
	}
}
