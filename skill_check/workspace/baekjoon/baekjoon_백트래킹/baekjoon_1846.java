package baekjoon_백트래킹;
import java.util.*;
public class baekjoon_1846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		if(n < 4) sb.append(-1);
		else {
			Queue<Integer> q = new LinkedList<>();
			for(int i = 0; i < n; i++) q.add(i);
			for(int i = 0; i < n; i++) {
				int next = q.poll();
				while(next == i || next == (n - i - 1)) {
					System.out.println(next + ", " + i);
					q.add(next);
					next = q.poll();
				}
				sb.append((next + 1) + "\n");
			}
		}
		System.out.print(sb);
	}
}
