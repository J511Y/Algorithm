package baekjoon_stack;
import java.util.*;
public class baekjoon_10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		int rnd = sc.nextInt();
		while(rnd-->0) {
			String s = sc.next();
			switch(s) {
			case "push" : stk.push(sc.nextInt()); break;
			case "pop"  : System.out.println(stk.size()==0?-1:stk.pop()); break;
			case "size" : System.out.println(stk.size()); break;
			case "empty": System.out.println(stk.empty()?1:0); break;
			case "top"  : System.out.println(stk.size()==0?-1:stk.peek()); break;
			}
		}
	}
}
