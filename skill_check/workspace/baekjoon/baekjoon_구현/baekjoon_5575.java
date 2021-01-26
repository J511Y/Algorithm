package baekjoon_±¸Çö;
import java.util.*;
public class baekjoon_5575 {
	public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            int A = (a * 3600) + (b * 60) + c;
            int B = (x * 3600) + (y * 60) + z;
            int C = B - A;
            int h = C / 3600, m = (C - h * 3600) / 60, s = (C - (h * 3600 + m * 60));
            System.out.println(h + " " + m + " " + s);
        }
    }
}
