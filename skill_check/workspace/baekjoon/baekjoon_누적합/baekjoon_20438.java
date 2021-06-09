package baekjoon_´©ÀûÇÕ;
import java.util.*;
import java.io.*;
public class baekjoon_20438 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Int(st.nextToken()), k = Int(st.nextToken()), q = Int(st.nextToken()), m = Int(st.nextToken());
		Set<Integer> set = new HashSet<>();
		int[] arr = new int[n + 3], sum = new int[n + 3];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) set.add(Int(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < q; i++) {
			int x = Int(st.nextToken());
			if(!set.contains(x)) {
				for(int j = x; j < n + 3; j += x) arr[j] = 1;
			}
		}
		for(int i : set) arr[i] = 0;
		for(int i = 3; i < n + 3; i++) sum[i] = sum[i-1] + (arr[i] == 0 ? 1 : 0);
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Int(st.nextToken()), b = Int(st.nextToken());
			bw.write((sum[b] - sum[a-1]) + "\n");
		}
		bw.flush();
	}
}
