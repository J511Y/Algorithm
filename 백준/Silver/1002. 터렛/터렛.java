import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt(), rst = 2;
			int dp = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			if (x1 == x2 && y1 == y2 && r1 == r2) rst = -1;
			else if (dp > Math.pow(r1 + r2, 2) || dp < Math.pow(r1 - r2, 2)) rst = 0;
			else if (dp == Math.pow(r1 + r2, 2) || dp == Math.pow(r1 - r2, 2)) rst = 1;
			System.out.println(rst);
		}
	}
}