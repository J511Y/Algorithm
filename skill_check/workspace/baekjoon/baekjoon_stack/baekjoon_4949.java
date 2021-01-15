package baekjoon_stack;
import java.util.*;
public class baekjoon_4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="";
		while(!(s = sc.nextLine()).equals(".")) {
			Stack<Byte> stk = new Stack<>();
			byte [] arr = s.getBytes();
			boolean print = true;
			for(byte b : arr) {
				if(b=='(' || b=='[') stk.push(b);
				else if(b==')') {
					if(stk.size()==0 || stk.peek()=='[') {
						System.out.println("no");
						print=false; break;
					}else stk.pop();
				}else if(b==']'){
					if(stk.size()==0 || stk.peek()=='(') {
						System.out.println("no");
						print=false; break;
					}else stk.pop();
				}
			}
			if(stk.size()==0 && print) System.out.println("yes");
			else if(stk.size()>0 && print)System.out.println("no");
		}
	}
}
