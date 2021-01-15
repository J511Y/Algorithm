package baekjoon_star;
// https://www.acmicpc.net/problem/2447
// º° Âï±â - 10
import java.io.*;
import java.util.*;
class baekjoon_2447 {
	static int[] pow = new int [8];
	static {
		for(int i=0; i<8; i++) pow[i] = (int)Math.pow(3, i);
	}
	static boolean func(int i, int j) {
		for (int k = 0; k < 8; k++) {
			if ((i / pow[k]) % 3 == 1 && (j / pow[k]) % 3 == 1) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] a) throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len=sc.nextInt();
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				bw.write(func(i,j)?' ':'*');
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
