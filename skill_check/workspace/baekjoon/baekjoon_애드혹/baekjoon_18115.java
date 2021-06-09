package baekjoon_æ÷µÂ»§;
import java.util.*;
public class baekjoon_18115 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = Int(sc.nextLine());
		Deque<Integer> dq = new LinkedList<>();
		int[] commands = new int[n];
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		for(int i = 0; i < n; i++) commands[i] = Int(st.nextToken());
		for(int i = 1; i <= n; i++) {
			switch(commands[n - i]) {
			case 1 : dq.addFirst(i); break;
			case 2 : int j = dq.pollFirst(); dq.addFirst(i); dq.addFirst(j); break;
			default : dq.addLast(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!dq.isEmpty()) sb.append(dq.pollFirst() + " ");
		System.out.print(sb);
	}
}
