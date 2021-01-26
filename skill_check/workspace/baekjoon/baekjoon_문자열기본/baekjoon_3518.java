package baekjoon_¹®ÀÚ¿­±âº»;
// https://www.acmicpc.net/problem/3518
// °ø¹é¿Õ ºó-Ä­
import java.util.*;
public class baekjoon_3518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String[]> list = new ArrayList<>();
		StringTokenizer st;
		int maxlen = 0;
		try {
			while(true) {
				st = new StringTokenizer(sc.nextLine().trim());
				int len = st.countTokens();
				if(len == 0) throw new Exception();
				maxlen = Math.max(maxlen, len);
				String[] arr = new String[len];
				for(int i = 0; i < len; i++) arr[i] = st.nextToken();
				list.add(arr);
			}
		}catch(Exception e) {
			int[] lengths = new int[maxlen];
			for(String[] arr : list) {
				for(int i = 0; i < arr.length; i++) lengths[i] = Math.max(lengths[i], arr[i].length() + 1);
			}
			StringBuffer sb = new StringBuffer();
			for(String[] arr : list) {
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length - 1) sb.append(String.format("%-" + lengths[i] + "s", arr[i]));
					else sb.append(arr[i] + "\n");
				}
			}
			System.out.println(sb);
		}
	}
}
