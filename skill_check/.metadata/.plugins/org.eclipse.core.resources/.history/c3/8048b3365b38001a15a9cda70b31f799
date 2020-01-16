package baekjoon_stack;
import java.util.*;
import java.io.*;
// https://www.acmicpc.net/submit/17298
public class baekjoon_17298 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> val = new Stack<>();
		Stack<Integer> idx = new Stack<>();
		
		int[] rst = new int [Integer.parseInt(br.readLine())];
		int[] arr = Arrays.stream(br.readLine().split(" "))
						.mapToInt(s -> Integer.parseInt(s))
						.toArray();
		int j = 0;
		for(int i : arr) {
			while(!val.empty() && val.peek() < i) {
				rst[idx.pop()] = i;
				val.pop();
			}
			val.add(i);
			idx.add(j++);
		}
		for(int i : rst)
			if(i == 0) bw.write(-1 + " ");
			else bw.write(i + " ");
		
		bw.flush();
	}
}
