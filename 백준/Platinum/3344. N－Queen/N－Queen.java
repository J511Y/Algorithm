import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Deque<Integer> even = new LinkedList<>(), odd = new LinkedList<>();
		for(int i = 1; i <= n; i++) (i % 2 == 0 ? even : odd).addLast(i);
		if(n % 6 == 2) {
			int a = odd.pollFirst(), b = odd.pollFirst(), c = odd.pollFirst();
			odd.addLast(c);
			odd.addFirst(a);
			odd.addFirst(b);
		}
		if(n % 6 == 3) {
			even.addLast(even.pollFirst());
			odd.addLast(odd.pollFirst());
			odd.addLast(odd.pollFirst());
		}
		while(!even.isEmpty()) System.out.println(even.pollFirst());
		while(!odd.isEmpty()) System.out.println(odd.pollFirst());
	}
}