package baekjoon_two_pointer;
// https://www.acmicpc.net/problem/2470
// µÎ ¿ë¾×
import java.util.*;
public class baekjoon_2470 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> acid = new ArrayList<>();
		List<Integer> alkali = new ArrayList<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			(x > 0 ? acid : alkali).add(x);
		}
		Collections.sort(acid);
		Collections.sort(alkali, Collections.reverseOrder());
		if(acid.size() == 0 || alkali.size() == 0) {
			for(int i = 0; i < 2; i++) System.out.print(((acid.size() == 0 ? alkali : acid).get(i)) + " ");
		}else {
			
		}
	}
}

