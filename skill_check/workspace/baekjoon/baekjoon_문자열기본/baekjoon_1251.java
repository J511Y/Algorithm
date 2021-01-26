package baekjoon_문자열기본;
// https://www.acmicpc.net/problem/1251
// 단어 나누기
import java.util.*;
public class baekjoon_1251 {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		int len = s.length();
		List<String> list = new ArrayList<>();
		for(int i = 1; i < len - 1; i++) {
			for(int j = i + 1; j < len; j++) {
				StringBuffer sb1 = new StringBuffer(s.substring(0, i)).reverse();
				StringBuffer sb2 = new StringBuffer(s.substring(i, j)).reverse();
				StringBuffer sb3 = new StringBuffer(s.substring(j)).reverse();
				list.add(sb1.append(sb2).append(sb3).toString());
			}
		}
		list.sort(null);
		System.out.println(list.get(0));
	}
}
