package baekjoon_��;
// https://www.acmicpc.net/problem/1453
// �ǽù�˹�
import java.util.*;
public class baekjoon_1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[101];
		int n = sc.nextInt(), cnt = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(arr[x] == 1) cnt++;
			arr[x] = 1;
		}
		System.out.println(cnt);
	}
}
