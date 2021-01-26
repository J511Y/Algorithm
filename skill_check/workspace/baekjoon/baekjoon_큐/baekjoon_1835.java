package baekjoon_Å¥;
// https://www.acmicpc.net/problem/1835
// Ä«µå
import java.util.*;
public class baekjoon_1835 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		Deque<Integer> q = new LinkedList<>();
		for(; n >= 1; n--) {
			q.addFirst(n);
			for(int i = 0; i < n; i++) q.addFirst(q.pollLast());
		}
		for(int i : q) System.out.print(i + " ");
	}
}
