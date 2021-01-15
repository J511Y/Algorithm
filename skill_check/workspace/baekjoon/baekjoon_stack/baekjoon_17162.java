package baekjoon_stack;
import java.util.*;
import java.io.*;
public class baekjoon_17162 {
	static int Int(String s) { return Integer.parseInt(s); }
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int q = Int(st.nextToken()), m = Int(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		Stack<Integer>[] list = new Stack[m];
		for (int i = 0; i < m; i++) list[i] = new Stack<>();
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Int(st.nextToken());
			if(t == 1) {
				int n = Int(st.nextToken()) % m;
				stack.push(n);
				list[n].push(stack.size());
			}
			if(t == 2 && !stack.isEmpty()) {
				int n = stack.pop();
				list[n].pop();
			}
			if(t == 3) {
				int rst = 1 << 30;
				for(int j = 0; j < m; j++) {
					if(list[j].isEmpty()) {
						rst = -1;
						break;
					}
					rst = Math.min(list[j].peek(), rst);
				}
				sb.append(rst == -1 ? -1 : (stack.size() - rst + 1)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
