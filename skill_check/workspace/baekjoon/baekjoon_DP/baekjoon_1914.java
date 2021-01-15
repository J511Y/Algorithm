package baekjoon_DP;
import java.util.*;
public class baekjoon_1914 {
	static StringBuffer sb = new StringBuffer();
	static void hanoi(int n, int from, int to, int aux){
		if(n == 1) {
			sb.append(from+" "+to+"\n");
			return;
		}
		hanoi(n-1, from, aux, to);
		sb.append(from+" "+to+"\n");
		hanoi(n-1, aux, to, from);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((long)Math.pow(2, n) - 1);
		hanoi(n,1,3,2);
		System.out.println(sb.toString());
	}
}
