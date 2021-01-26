package baekjoon_문자열기본;
import java.util.*;
public class baekjoon_1062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		if (k < 5) {
			System.out.println(0);
			return;
		}
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) arr[i] = sc.next();
		for(int i = 0; i < n; i++) {
			boolean[] alpha = new boolean[26];
			int alphaCnt = 0;
			for(byte b : arr[i].getBytes()) alpha[b - 'a'] = true;
			for(boolean b : alpha) alphaCnt += b ? 1 : 0;
			if(alphaCnt > k) continue;
			for(String s : arr) {
				for(byte b : s.getBytes()) {
					
				}
			}
		}
	}
}
