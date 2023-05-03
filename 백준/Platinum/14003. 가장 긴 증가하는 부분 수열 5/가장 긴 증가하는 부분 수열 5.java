import java.util.*;
import java.io.*;
class Main {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine()), last = 1, idx = 0, max = 0;
		int[] arr = new int[n + 1], dp = new int[n + 1], input = new int[n];
		Arrays.fill(arr, 1 << 30);
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int m = Int(st.nextToken());
			input[idx] = m;
			if (arr[last - 1] < m) {
				max = Math.max(max, dp[idx] = last);
				arr[last++] = m;
			} else {
				int l = 0, r = last;
				while(l < r) {
					int mid = (l + r) / 2;
					if (arr[mid] < m) l = mid + 1;
					else r = mid;
				}
				arr[r] = m;
				max = Math.max(max, dp[idx] = r);
			}
			idx++;
		}
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for(int i = n - 1, d = last - 1; i >= 0; i--) {
			if (dp[i] == d) {
				list.add(input[i]);
				d--;
			}
		}
		list.sort(null);
		sb.append(list.size() + "\n");
		for(int i : list) sb.append(i + " ");
		System.out.print(sb);
	}
}