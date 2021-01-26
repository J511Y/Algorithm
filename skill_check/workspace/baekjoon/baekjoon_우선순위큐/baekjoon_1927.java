package baekjoon_우선순위큐;
// https://www.acmicpc.net/problem/1927
// 최소 힙
import java.io.*;
import java.util.*;
class baekjoon_1927{
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
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