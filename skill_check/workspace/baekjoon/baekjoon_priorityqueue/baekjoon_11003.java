package baekjoon_priorityqueue;

import java.util.*;
import java.io.*;
public class baekjoon_11003 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Int(st.nextToken()), l = Int(st.nextToken());
		int[] rst = new int[n], arr = new int[n];
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr[i] = Int(st.nextToken());
			while (!dq.isEmpty() && arr[dq.peekLast()] > arr[i]) dq.pollLast();
			dq.offer(i);
			if (dq.peekFirst() <= i - l) dq.pollFirst();
			rst[i] = arr[dq.peekFirst()];
		}
		for(int i : rst) sb.append(i).append(" ");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
