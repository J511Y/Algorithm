package baekjoon_����;
import java.util.*;
public class baekjoon_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) set.add(sc.next());
		list.addAll(set);
		list.sort((s1, s2)-> {
			int len = s1.length() - s2.length();
			return len == 0 ? s1.compareTo(s2) : len;
		});
		for(String s : list) System.out.println(s);
	}
}
