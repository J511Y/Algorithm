package baekjoon_우선순위큐;
// https://www.acmicpc.net/problem/11279
// 최대 힙
import java.io.*;
import java.util.*;
class baekjoon_11279{
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{return b - a;});
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