package baekjoon_�⺻����;
import java.util.*;
class Main{
	public static void main(String[] g){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), x = (sc.nextInt() - sc.nextInt()) * -1;
		System.out.println(x <= 0 ? -1 : (a / x + 1));
	}
}