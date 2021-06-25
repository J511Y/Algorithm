package baekjoon_±×¸®µð;
import java.util.*;
public class baekjoon_21313 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n / 2; i++) System.out.print("1 2 ");
		if(n % 2 == 1) System.out.print(3);
	}
}
