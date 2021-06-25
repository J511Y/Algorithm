package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_15720 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), min = Math.min(Math.min(a, b), c), max = Math.max(Math.max(a, b), c);
		int maxsum = 0, minsum = 0;
		Integer[] A = new Integer[max], B = new Integer[max], C = new Integer[max];
		Arrays.fill(A, 0);
		Arrays.fill(B, 0);
		Arrays.fill(C, 0);
		for(int i = 0; i < a; i++) A[i] = sc.nextInt();
		for(int i = 0; i < b; i++) B[i] = sc.nextInt();
		for(int i = 0; i < c; i++) C[i] = sc.nextInt();
		Arrays.sort(A, (x, y) -> y - x);
		Arrays.sort(B, (x, y) -> y - x);
		Arrays.sort(C, (x, y) -> y - x);
		for(int i = 0; i < max; i++) {
			int val = A[i] + B[i] + C[i];
			maxsum += val;
			minsum += val * (i < min ? 0.9 : 1);
		}
		System.out.println(maxsum);
		System.out.print(minsum);
	}
}
