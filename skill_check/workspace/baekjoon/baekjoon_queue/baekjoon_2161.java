package baekjoon_queue;
// https://www.acmicpc.net/problem/2161
// 카드1
/*
 * 문제 풀기 전 생각 2020.04.19 21:46
 * ----------------------------
 * DEQUE 써서 뚝딱 가능할듯
 */
import java.util.*;
public class baekjoon_2161 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Deque<Integer> dq = new LinkedList<>(); 
		for(int i = 1; i <= n; i++) dq.addLast(i);
		while(true) {
			System.out.print(dq.pollFirst() + " ");
			if(!dq.isEmpty())dq.addLast(dq.pollFirst());
			else break;
		}
	}
}
