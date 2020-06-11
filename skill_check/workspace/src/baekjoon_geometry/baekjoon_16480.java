package baekjoon_geometry;
// https://www.acmicpc.net/problem/16480
// 외심과 내심은 사랑입니다
import java.util.*;
public class baekjoon_16480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong(), l = sc.nextLong();
		System.out.println(r * (r - l * 2));
	}
}
