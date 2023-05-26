import java.util.*;
public class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long min = 1l << 60;
		long[] arr = new long[n], rst = {};
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(int i = 0; i < n && min > 0; i++) {
			int l = i + 1, r = n - 1;
			while(l < r) {
				long sum = arr[l] + arr[r] + arr[i], abs = Math.abs(sum);
				if (min > abs) {
					min = abs;
					rst = new long[] { arr[i], arr[l], arr[r] };
				}
				if (sum < 0) l++;
				else r--;
			}
		}
		for(long l : rst) System.out.print(l + " ");
	}
}