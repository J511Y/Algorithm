package baekjoon_Àç±Í;

import java.util.*;
public class baekjoon_1769 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		while(s.matches("[0-9]{2,}")) {
			int sum = 0;
			for(char c : s.toCharArray()) sum += c - '0';
			cnt++;
			s = sum + "";
		}
		System.out.println(cnt);
		System.out.println(Integer.parseInt(s) % 3 == 0 ? "YES" : "NO");
	}
}
