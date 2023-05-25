import java.util.*;
public class Main {
	static long cnt = 0;
	static Map<Long, Integer> getMap(long[] arr) {
		Map<Long, Integer> map = new HashMap<>();
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				long now = arr[j] - arr[i];
				map.put(now, map.getOrDefault(now, 0) + 1);
			}
		}
		return map;
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n = sc.nextInt();
		long[] N = new long[n + 1];
		for(int i = 1; i <= n; i++) N[i] = N[i - 1] + sc.nextInt();
		int m = sc.nextInt();
		long[] M = new long[m + 1];
		for(int i = 1; i <= m; i++) M[i] = M[i - 1] + sc.nextInt();
		Map<Long, Integer> nmap = getMap(N), mmap = getMap(M);
		nmap.entrySet().forEach(x -> {
			Long key = x.getKey();
			long val = x.getValue();
			cnt += val * mmap.getOrDefault((long)t - key, 0);
		});
		System.out.print(cnt);
	}
}