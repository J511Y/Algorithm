package baekjoon_�׸���;
// https://www.acmicpc.net/problem/1783
// ���� ����Ʈ
import java.util.*;
public class baekjoon_1783 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		if(n == 1) System.out.println(1);
		if(n == 2) System.out.println(m >= 7 ? 4 : m >= 5 ? 3 : m >= 3 ? 2 : 1);
		if(n >= 3) {
			if(m >= 7) System.out.println(m - 2);
			else if(m <= 4) System.out.println(m);
			else System.out.println(4);
		}
	}
}
