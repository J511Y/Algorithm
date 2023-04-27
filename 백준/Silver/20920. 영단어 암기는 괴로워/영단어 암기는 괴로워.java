import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] ar) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]), k = Integer.parseInt(split[1]);
		Map<String, Integer> map = new HashMap<>();
		while(n-->0) {
			String a = br.readLine();
			if (a.length() < k) continue;
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		List<String> list = new ArrayList<>(map.keySet());
		list.sort((a, b) -> {
			int ac = map.get(a), bc = map.get(b), al = a.length(), bl = b.length();
			if (ac - bc != 0) return bc - ac;
			if (al - bl != 0) return bl - al;
			return a.compareTo(b);
		});
		StringBuilder sb = new StringBuilder();
		for(String s : list) sb.append(s).append("\n");
		System.out.print(sb);
	}
}