import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = 2;
		while(n-->0) m += m - 1;
		System.out.print(m * m);
	}
}