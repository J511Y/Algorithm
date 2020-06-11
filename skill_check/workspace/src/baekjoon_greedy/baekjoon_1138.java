package baekjoon_greedy;
// https://www.acmicpc.net/problem/1138
// 한 줄로 서기
import java.util.*;
public class baekjoon_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			int left = sc.nextInt();
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				if(cnt == left && arr[j] == 0) {
					arr[j] = i + 1;
					break;
				}
				cnt += arr[j] == 0 ? 1 : 0;
			}
		}
		for(int i : arr) System.out.print(i + " ");
	}
}
