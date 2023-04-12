import java.util.*;
class Main {
	static Set<String> set = new HashSet<>();
	static void dfs(String[] arr, int n, int k, int bit, int bitCount, String str) {
		if (bitCount > k) return;
		if (bitCount == k) set.add(str);
		for(int i = 0; i < n; i++) {
			int b = 1 << i;
			if ((bit & b) > 0) continue;
			dfs(arr, n, k, bit | b, bitCount + 1, str + arr[i]);
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) arr[i] = sc.next();
		dfs(arr, n, k, 0, 0, "");
		System.out.print(set.size());
	}
}