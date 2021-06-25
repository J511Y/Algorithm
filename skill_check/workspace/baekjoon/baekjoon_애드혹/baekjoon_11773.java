package baekjoon_æ÷µÂ»§;
import java.util.*;
public class baekjoon_11773 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= b; i++) {
			int j = i;
			StringBuilder word = new StringBuilder();
			while(j > 0) {
				word.append((char)('a' + (j % 26)));
				j /= 26;
			}
			sb.append(word + " ");
		}
		System.out.print(sb);
	}
}
