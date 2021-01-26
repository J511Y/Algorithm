package baekjoon_±âº»;
import java.util.*;
public class baekjoon_1543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String docu = sc.nextLine();
		String word = sc.nextLine();
		int cnt = 0;
		for(int i=0; i<docu.length(); i++) {
			String s = docu.substring(i);
			if(s.startsWith(word)) {
				cnt++;
				i += word.length() - 1;
			}
		}
		System.out.println(cnt);
	}
}
