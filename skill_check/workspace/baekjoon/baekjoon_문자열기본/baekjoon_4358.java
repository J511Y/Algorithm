package baekjoon_문자열기본;

import java.util.*;
import java.io.*;
public class baekjoon_4358 {
	static double total = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		Map<String, Integer> map = new HashMap<>();
		while(!(s = br.readLine()).equals("") && ++total > 0) map.put(s, map.getOrDefault(s, 0) + 1);
		map.keySet().stream().sorted().forEach(a -> {System.out.printf("%s %.4f\n", a, map.get(a) / total * 100);});
	}
}
