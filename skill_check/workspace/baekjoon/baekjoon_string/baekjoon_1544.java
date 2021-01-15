package baekjoon_string;
// https://www.acmicpc.net/problem/1544
// 사이클 단어
import java.util.*;
public class baekjoon_1544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int j = 0;
			int len = s.length();
			s += s;
			for(; j < len; j++) {
				if(set.contains(s.substring(j, j + len))) break;
			}
			if(j == len) set.add(s.substring(0, len));
		}
		System.out.println(set.size());
	}
}
