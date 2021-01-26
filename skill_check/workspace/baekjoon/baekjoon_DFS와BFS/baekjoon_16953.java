package baekjoon_DFS¿ÍBFS;

import java.util.*;
public class baekjoon_16953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), rst = -1;
		Queue<long[]> q = new LinkedList<>();
		q.add(new long[] {a, 1});
		
		while(!q.isEmpty()) {
			long[] poll = q.poll();
			long x = poll[0], d = poll[1];
			if(x == b) {
				rst = (int)d;
				break;
			}
			if(x * 2 <= b) q.add(new long[] {x * 2, d + 1});
			if(x * 10 + 1 <= b) q.add(new long[] {x * 10 + 1, d + 1});
		}
		System.out.println(rst);
	}
}
