package baekjoon_string;
// https://www.acmicpc.net/problem/11383
// ŒÍ
import java.util.*;
class baekjoon_11383{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), equal = 1;
		String[] input = new String[n];
		for(int i = 0; i < n; i++) input[i] = sc.next();
		for(int i = 0; i < n; i++){
			StringBuffer sb = new StringBuffer();
			String s = input[i];
			int len = s.length();
			for(int j = 0; j < len; j++) sb.append(s.charAt(j)).append(s.charAt(j));
			if(!sc.next().equals(sb.toString())) equal = 0;
		}
		if(equal == 0) System.out.print("Not Eyfa");
		else System.out.print("Eyfa");
	}
}