package baekjoon_priorityqueue;
// https://www.acmicpc.net/problem/11286
// Àý´ñ°ª Èü

import java.io.*;
import java.util.*;
class baekjoon_11286{
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
		    if(Math.abs(a) - Math.abs(b) == 0) return a - b;
		    return Math.abs(a) - Math.abs(b);
		});
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		while(n-->0){
			int x = Integer.parseInt(br.readLine());
			if(x == 0) sb.append((pq.size() > 0 ? pq.poll() : 0) + "\n");
			else pq.add(x);
		}
		System.out.print(sb);
	}
}