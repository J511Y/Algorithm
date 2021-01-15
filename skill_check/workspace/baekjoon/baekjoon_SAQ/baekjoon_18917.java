package baekjoon_SAQ;
// https://www.acmicpc.net/problem/18917
// ¼ö¿­°ú Äõ¸® 38
import java.util.*;
class baekjoon_18917{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt(), xor = 0;
		long sum = 0;
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			if(m == 1) {
			    int x = sc.nextInt();
			    sum += x;
			    xor ^= x;
			}
			if(m == 2) {
			    int x = sc.nextInt();
			    sum -= x;
			    xor ^= x;
			}
			if(m == 3) sb.append(sum + "\n");
			if(m == 4) sb.append(xor + "\n");
		}
		System.out.print(sb);
	}
}
