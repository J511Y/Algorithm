package baekjoon_ÇØ½Ã¸Ê;

import java.util.*;
public class baekjoon_9375 {
	static int rst = 1;
	static int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        for(String [] arr : clothes) map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        map.values().stream().forEach(s-> rst *= s+1);
        return rst-1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(); sc.nextLine();
			rst = 1;
			String[][] arr = new String[n][];
			for(int i = 0; i < n; i++) arr[i] = sc.nextLine().split(" ");
			System.out.println(solution(arr));
		}
	}
}
