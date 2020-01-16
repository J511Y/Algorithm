package workspace.baekjoon;
import java.util.*;
public class baekjoon_9996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String pattern = sc.next();
		String [] patt = new String [] {pattern.substring(0,pattern.indexOf("*")), pattern.substring(pattern.indexOf("*")+1)};
		for(int i=0; i<N; i++) {
			String input = sc.next();
			if( input.length() < patt[0].length() + patt[1].length()) {
				System.out.println("NE");
				continue;
			}
			if( input.startsWith(patt[0]) && input.endsWith(patt[1])) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
	}
}
