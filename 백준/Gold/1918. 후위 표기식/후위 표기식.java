import java.util.*;
class Main {
	static int getPriority(char c) {
		if (c == '*' || c == '/') return 1;
		if (c == '(' || c == ')') return -1;
		return 0;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(char c : arr) {
			if (c >= 'A') sb.append(c);
			else if (c == '(') stack.add(c);
			else if (c == ')') {
				char p;
				while((p = stack.pop()) != '(') sb.append(p);
			} else {
				while(!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(c)) sb.append(stack.pop());
				stack.add(c);
			}
		}
		while(!stack.isEmpty()) sb.append(stack.pop());
		System.out.print(sb);
	}
}