package baekjoon_우선순위큐;
// https://www.acmicpc.net/problem/1655
// 가운데를 말해요
import java.util.*;
import java.io.*;
public class baekjoon_1655 {
	static int Int(String s) { return Integer.parseInt(s); }
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> min = new PriorityQueue<Integer>((a, b)->{return a - b;}), max = new PriorityQueue<Integer>((a, b)->{return b - a;});
		int n = Int(br.readLine());
        StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++) {
			int next = Int(br.readLine());
			if(min.size() == max.size()) max.add(next);
			else min.add(next);
			
			if((min.isEmpty() || max.isEmpty()) == false && min.peek() < max.peek()) {
				int a = min.poll();
				min.add(max.poll());
				max.add(a);
			}
			sb.append(max.peek() + "\n");
		}
        System.out.print(sb);
	}
}
