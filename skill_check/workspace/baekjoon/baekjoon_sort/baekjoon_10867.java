package baekjoon_sort;
// https://www.acmicpc.net/problem/10867
// 중복 빼고 정렬하기
/*
 * 문제
N개의 정수가 주어진다. 
이때, N개의 정수를 오름차순으로 정렬하는 프로그램을 작성하시오. 
같은 정수는 한 번만 출력한다.

입력
첫째 줄에 수의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 
둘째에는 숫자가 주어진다. 
이 수는 절댓값이 1,000보다 작거나 같은 정수이다.

출력
첫째 줄에 수를 오름차순으로 정렬한 결과를 출력한다. 
이때, 같은 수는 한 번만 출력한다.
 */

/*
 * 문제 풀기 전 생각 2020.02.23 00:52
 * -----------------------------
 * 카운팅 정렬 사용하면 될 듯
 */
import java.util.*;
public class baekjoon_10867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2002];
		for(int i = 0; i < n; i++) arr[sc.nextInt() + 1000] = 1;
		for(int i = 0; i < 2002; i++) {
			if(arr[i] == 1) System.out.print((i - 1000) + " ");
		}
	}
}
