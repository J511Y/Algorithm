import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min = Integer.MAX_VALUE, left = 0, right = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int l = 0, r = n - 1;
		while(l < r) {
			int sum = arr[l] + arr[r], abs = Math.abs(sum);
			if (min > abs) {
				min = abs;
				left = arr[l];
				right = arr[r];
			}
			if (sum < 0) l++;
			else r--;
		}
		System.out.print(left + " " + right);
	}
}