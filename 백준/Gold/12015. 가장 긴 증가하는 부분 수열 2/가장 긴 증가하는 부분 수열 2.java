import java.util.*;
import java.io.*;
class Main {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine()), last = 1;
		int[] arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int m = Int(st.nextToken());
			if (arr[last - 1] < m) arr[last++] = m;
			else {
				int l = 0, r = last;
				while(l < r) {
					int mid = (l + r) / 2;
					if (arr[mid] < m) l = mid + 1;
					else r = mid;
				}
				arr[r] = m;
			}
		}
		System.out.print(last - 1);
	}
}