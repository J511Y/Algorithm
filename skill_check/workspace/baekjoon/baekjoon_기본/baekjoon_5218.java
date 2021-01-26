package baekjoon_±âº»;
import java.util.*;
public class baekjoon_5218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = sc.nextInt();
		while(rnd-->0) {
			String str1 = sc.next(), str2 = sc.next();
			System.out.print("Distances:");
			for(int i=0; i<str1.length(); i++) {
				int dis = str2.charAt(i)-str1.charAt(i);
				if(dis<0) dis+=26;
				System.out.print(" "+dis);
			}
			System.out.println();
		}
	}
}
