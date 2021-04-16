package baekjoon_¿ì¼±¼øÀ§Å¥;

import java.util.*;
public class baekjoon_11000 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) arr[i] = new int[] {sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr, (a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(arr[0][1]);
		for(int i = 1; i < n; i++) {
		    if(pq.isEmpty()) pq.add(arr[i][1]);
		    else {
		        if(pq.peek() <= arr[i][0]) pq.poll();
		        pq.add(arr[i][1]);
		    }
		}
		System.out.print(pq.size());
	}
}
