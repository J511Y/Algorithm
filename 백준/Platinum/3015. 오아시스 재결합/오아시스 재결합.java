import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Stack<int[]> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			while(!stack.isEmpty() && stack.peek()[0] <= arr[i]) {
				int[] p = stack.pop();
				sum += p[1];
				cnt = p[0] == arr[i] ? p[1] + 1 : 1;
			}
			sum += stack.isEmpty() ? 0 : 1;
			stack.push(new int[] { arr[i], cnt });
		}
		System.out.print(sum);
	}
}