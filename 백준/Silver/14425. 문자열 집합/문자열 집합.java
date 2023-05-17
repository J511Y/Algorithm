import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
		Set<String> set = new HashSet<>();
		while(n-->0) set.add(sc.next());
		while(m-->0) cnt += set.contains(sc.next()) ? 1 : 0;
		System.out.print(cnt);
	}
}