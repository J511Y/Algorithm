package baekjoon_hashmap;
// https://www.acmicpc.net/problem/1620
// 나는야 포켓몬 마스터 이다솜
import java.util.*;
public class baekjoon_1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		String[] arr = new String[n+1];
		Map<String, Integer> map = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			String s = sc.next();
			arr[i] = s;
			map.put(s, i);
		}
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			try {
				int a = Integer.parseInt(s);
				System.out.println(arr[a]);
			}catch(Exception e) {
				System.out.println(map.get(s));
			}
		}
	}
}
