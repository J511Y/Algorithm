package baekjoon_queue;
import java.util.*;
import java.io.*;
public class baekjoon_18258 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<String> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push" : q.addLast(s[1]);break;
			case "pop"  : if(q.isEmpty()) bw.write("-1\n"); else bw.write(q.pollFirst() + "\n");break;
			case "size" : bw.write(q.size() + "\n"); break;
			case "empty": bw.write((q.isEmpty() ? 1 : 0) + "\n"); break;
			case "front": if(q.isEmpty()) bw.write("-1\n"); else bw.write(q.peekFirst() + "\n");break;
			case "back" : if(q.isEmpty()) bw.write("-1\n"); else bw.write(q.peekLast() + "\n");break;
			}
		}
		bw.flush();
	}
}
