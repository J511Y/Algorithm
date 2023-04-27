import java.util.*;
class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		set.add("ChongChong");
		int n = sc.nextInt(), cnt = 1;
		while(n-->0) {
			String a = sc.next(), b = sc.next();
			boolean infect = set.contains(a) ^ set.contains(b);
			if (infect) {
				set.add(a);
				set.add(b);
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}