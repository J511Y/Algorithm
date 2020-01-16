package baekjoon_stack;
import java.util.*;
public class baekjoon_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = sc.nextInt();
		while(rnd-->0) {
			Stack<Byte> stk = new Stack<>();
			byte [] arr = sc.next().getBytes();
			try {
				for(byte b : arr) {
					if(b=='(') stk.push(b);
					else stk.pop();
				}
			}catch(Exception e) {
				System.out.println("NO");
				continue;
			}
			if(stk.size()>0)System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
