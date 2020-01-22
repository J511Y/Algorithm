package baekjoon_string;
import java.util.*;
public class baekjoon_1296 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 0, o = 0, v = 0, e = 0, max = 0;
		String s = sc.next(), result = "";
		for(char c : s.toCharArray()) {
			switch(c) {
				case 'L': l++; break;
				case 'O': o++; break;
				case 'V': v++; break;
				case 'E': e++; break;
			}
		}
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			int L = l, O = o, V = v, E = e;
			s = sc.next();
			if(i == 0) result = s;
			for(char c : s.toCharArray()) {
				switch(c) {
					case 'L': L++; break;
					case 'O': O++; break;
					case 'V': V++; break;
					case 'E': E++; break;
				}
			}
			int point = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100;
			if(max < point) {
				max = point;
				result = s;
			} else if (max == point) {
				result = result.compareTo(s) < 0 ? result : s;
			}
		}
		System.out.println(result);
	}
}
