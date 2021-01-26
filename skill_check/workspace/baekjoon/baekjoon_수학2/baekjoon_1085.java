package baekjoon_¼öÇÐ2;
import java.util.*;
public class baekjoon_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println(Math.min(Math.min(x-a, a), Math.min(y-b, b)));

	}
}
