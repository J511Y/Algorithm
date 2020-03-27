package baekjoon_math;
// https://www.acmicpc.net/problem/2010
// ÇÃ·¯±×
import java.io.*;
public class baekjoon_2010 {
	static int Int(String s) {return Integer.parseInt(s);}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Int(br.readLine()), sum = 0;
		for(int i = 0; i < n; i++) sum += Int(br.readLine());
		System.out.println(sum - n + 1);
	}
}
