import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int l = 0, r = n - 1, x = sc.nextInt();
		while(l < r) {
			int sum = arr[l] + arr[r];
			cnt += sum == x ? 1 : 0;
			if (sum > x) r--;
			else l++;
		}
		System.out.print(cnt);
	}
}