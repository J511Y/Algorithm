import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(), n = sc.nextInt(), cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(int i = 0; i < n && p < 200; i++, cnt++) p += arr[i];
		System.out.print(cnt);
	}
}