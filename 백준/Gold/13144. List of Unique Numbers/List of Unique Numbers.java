import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long answer = 0;
		int[] arr = new int[n], cnt = new int[100001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int left = 0, right = 0; left < n; left++) {
			while(right < n && cnt[arr[right]] == 0) cnt[arr[right++]]++;
			answer += right - left;
			cnt[arr[left]]--;
		}
		System.out.println(answer);
	}
}