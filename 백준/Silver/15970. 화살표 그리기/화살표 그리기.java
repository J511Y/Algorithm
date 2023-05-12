import java.util.*;
public class Main {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), INF = 987654321, sum = 0;
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		for(int i = 0; i < n; i++) {
			int left = INF, right = INF;
			for(int j = i - 1; j >= 0; j--) {
				if (arr[j][1] == arr[i][1]) {
					left = Math.abs(arr[i][0] - arr[j][0]);
					break;
				}
			}
			for(int j = i + 1; j < n; j++) {
				if (arr[j][1] == arr[i][1]) {
					right = Math.abs(arr[i][0] - arr[j][0]);
					break;
				}
			}
			sum += Math.min(left, right);
		}
		System.out.print(sum);
	}
}