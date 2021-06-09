package baekjoon_Ω∫≈√;
import java.util.*;
public class baekjoon_12789 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = 1;
		Stack<Integer> stack = new Stack<>();
		while(n-->0) {
			int m = sc.nextInt();
			if(s == m) {
				s++;
				while(!stack.isEmpty() && stack.peek() == s) {
					stack.pop();
					s++;
				}
			} else stack.push(m);
		}
		while(!stack.isEmpty() && stack.peek() == s) {
			stack.pop();
			s++;
		}
		System.out.println(stack.isEmpty() ? "Nice" : "Sad");
	}
}
