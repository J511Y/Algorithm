package baekjoon_Á¤·Ä;
import java.util.*;
public class baekjoon_5874 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		List<Integer> open = new ArrayList<>(), close = new ArrayList<>();
		for(int i = 0; i < arr.length - 1; i++) if(arr[i] == arr[i+1]) (arr[i] == '(' ? open : close).add(i);
		int cnt = 0, j = 0, s = close.size();
		for(int i : open) {
			while(j < s && close.get(j) < i) j++;
			if(j < s && i < close.get(j)) cnt += s - j;
		}
		System.out.println(cnt);
	}
}
