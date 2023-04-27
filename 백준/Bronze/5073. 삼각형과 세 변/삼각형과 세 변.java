import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max = Math.max(Math.max(a, b), c), sum = a + b + c;
			if (a == 0) return;
			String s = "Invalid";
			if (max < sum - max) {
				if (a != b && b != c && a != c) s = "Scalene";
				else if (a == b && b == c) s = "Equilateral";
				else s = "Isosceles";
			}
			System.out.println(s);
		}
	}
}