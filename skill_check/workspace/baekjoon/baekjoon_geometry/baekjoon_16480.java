package baekjoon_geometry;
// https://www.acmicpc.net/problem/16480
// �ܽɰ� ������ ����Դϴ�
import java.util.*;
public class baekjoon_16480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong(), l = sc.nextLong();
		System.out.println(r * (r - l * 2));
	}
}
