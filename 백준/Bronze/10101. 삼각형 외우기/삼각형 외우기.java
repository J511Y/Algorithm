import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		String s = "Error";
		if (a + b + c == 180) {
			if (a != b && b != c && a != c) s = "Scalene";
			else if (a == b && b == c) s = "Equilateral";
			else s = "Isosceles";
		}
		System.out.print(s);
	}
}