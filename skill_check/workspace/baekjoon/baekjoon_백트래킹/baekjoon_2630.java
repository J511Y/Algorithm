package baekjoon_백트래킹;
// https://www.acmicpc.net/problem/2630
// 색종이 만들기
import java.util.*;
public class baekjoon_2630 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) arr[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		
	}
}
