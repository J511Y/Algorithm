package baekjoon_�⺻;
// https://www.acmicpc.net/problem/14681
// ��и� ����
import java.util.*;
public class baekjoon_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(a > 0 ? (b > 0? 1 : 4) : (b > 0? 2 : 3));
	}
}
