package workspace.baekjoon;
import java.util.*;
public class baekjoon_2810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String seat = sc.next();
		int cnt = 1;
		for(int i=0; i<seat.length(); i++) {
			if(seat.charAt(i) == 'S') cnt++;
			else {
				i++;
				cnt++;
			}
		}
		if(cnt > seat.length())System.out.println(seat.length());
		else System.out.println(cnt);
	}
}
