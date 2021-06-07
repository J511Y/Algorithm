package baekjoon_기본수학;
import java.util.*;
public class baekjoon_17173 {
	static int i = 1;
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
		int[] arr = new int[m];
		while(m-->0) arr[m] = sc.nextInt();
		for(; i <= n; i++) sum += Arrays.stream(arr).anyMatch(a -> i % a == 0) ? i : 0;
		System.out.print(sum);
	}
}
