package baekjoon_simulation;
// https://www.acmicpc.net/problem/2455
// ������ ����
// ���͵� �ð��� Ǯ������ 2020.02.24
import java.util.*;
public class baekjoon_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, max = 0;
		for(int i = 0; i < 4; i++){
			cnt += (sc.nextInt() * -1) + sc.nextInt();
			max = Math.max(max, cnt);
		}
		System.out.println(max > 10000 ? 10000 : max);
	}
}
