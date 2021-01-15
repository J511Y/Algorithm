package baekjoon_math2;
import java.util.*;
public class baekjoon_4153 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] tri = new int[3];
//		while(true) {
//			for(int i=0; i<3; i++) tri[i] = sc.nextInt();
//			Arrays.sort(tri);
//			if(Arrays.stream(tri).sum() == 0) return;
//			boolean right = Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2);
//			System.out.println(right ? "right" : "wrong");
//		}
		double d1 = Math.pow(0.1, 2) + Math.pow(0.2, 2);
		double d2 = Math.pow(0.3, 2);
		System.out.println(d1 == d2);
		System.out.println(d1);
	}
}
