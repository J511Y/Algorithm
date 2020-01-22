package baekjoon_math2;
import java.util.*;
public class baekjoon_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int [3];
		int[] y = new int [3];
		for(int i=0; i<3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		Arrays.sort(x); Arrays.sort(y);
		System.out.println((x[0] == x[1] ? x[2] : x[0]) + " " + (y[0] == y[1] ? y[2] : y[0]));
	}
}
