package baekjoon_stack;
import java.util.*;
public class baekjoon_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		int rnd = sc.nextInt();
		while(rnd-->0) {
			int i = sc.nextInt();
			if(i==0) stk.pop();
			else stk.push(i);
		}
		int sum = 0;
		for(int i : stk) sum+=i;
		System.out.println(sum);
	}
}
