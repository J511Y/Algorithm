package baekjoon_백트래킹;
// https://www.acmicpc.net/problem/7490
// 0 만들기
import java.util.*;
public class baekjoon_7490 {
	static int n;
	static void BackTracking(int x, StringBuffer sb) {
		if(x == n + 1) {
			Queue<String> q = new LinkedList<>();
			char[] arr = sb.toString().replace(" ", "").toCharArray();
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == '+' || arr[i] == '-') q.add(arr[i] + "");
				else {
					int j = i + 1;
					while(j < arr.length && arr[j] != '+' && arr[j] != '-') j++;
					String s = "";
					for(int k = i; k < j; k++) s += arr[k];
					q.add(s);
					i = j - 1;
				}
			}
			while(!q.isEmpty()) {
				String poll = q.poll();
				if(poll.equals("+")) sum += Integer.parseInt(q.poll());
				else if(poll.equals("-")) sum -= Integer.parseInt(q.poll());
				else sum = Integer.parseInt(poll);
			}
			if(sum == 0) System.out.println(sb);
			return;
		}
		BackTracking(x + 1, new StringBuffer(sb + " " + x));
		BackTracking(x + 1, new StringBuffer(sb + "+" + x));
		BackTracking(x + 1, new StringBuffer(sb + "-" + x));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			n = sc.nextInt();
			BackTracking(2, new StringBuffer("1"));
			System.out.println();
		}
	}
}
