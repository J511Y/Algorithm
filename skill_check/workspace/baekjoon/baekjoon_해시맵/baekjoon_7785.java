package baekjoon_해시맵;
// https://www.acmicpc.net/problem/7785
// 회사에 있는 사람
import java.util.*;
public class baekjoon_7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < n; i++) map.put(sc.next(), sc.next());
		List<String> list = new ArrayList<>();
		list.addAll(map.keySet());
		list.sort(Collections.reverseOrder());
		for(String s : list) if(map.get(s).equals("enter")) System.out.println(s);
	}
}
