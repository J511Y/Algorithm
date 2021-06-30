package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_19941 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), cnt = 0;
		char[] arr = sc.next().toCharArray();
		for(int i = 0; i < n; i++) {
			if(arr[i] == 'P') {
				for(int j = i - k; j <= i + k; j++) {
					if(0 <= j && j < n && arr[j] == 'H') {
						arr[j] = ' ';
						cnt++;
						break;
					}
				}
			}
		}
		System.out.print(cnt);
	}
}
