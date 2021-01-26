package baekjoon_±âº»;

import java.util.*;
public class baekjoon_1526 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		while(!Arrays.stream((n + "").split("")).allMatch(a -> a.equals("4") || a.equals("7"))) n--;
		System.out.print(n);
	}
}
