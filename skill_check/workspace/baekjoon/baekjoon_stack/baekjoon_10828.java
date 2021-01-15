package baekjoon_stack;
import java.util.*;
import java.io.*;
public class baekjoon_10828 {
	static int[] stack = new int[10001];
	static int idx = -1;
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Int(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.startsWith("push")) stack[++idx] = Int(st.nextToken());
			else if(s.startsWith("pop")) bw.write((idx == -1 ? -1 : stack[idx--]) + "\n");
			else if(s.startsWith("top")) bw.write((idx == -1 ? -1 : stack[idx]) + "\n");
			else if(s.startsWith("size")) bw.write((idx + 1) + "\n");
			else if(s.startsWith("empty"))bw.write((idx == -1 ? 1 : 0) + "\n");
		}
		bw.flush();
	}
}
