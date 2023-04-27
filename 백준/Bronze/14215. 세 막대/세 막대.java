import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max = Math.max(Math.max(a, b), c), other = (a + b + c) - max;
		while (max >= other) max--;
		System.out.print(other + max);
	}
}