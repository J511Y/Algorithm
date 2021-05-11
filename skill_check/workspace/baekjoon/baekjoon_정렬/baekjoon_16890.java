package baekjoon_Á¤·Ä;

import java.util.*;
public class baekjoon_16890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] k = sc.next().toCharArray(), c = sc.next().toCharArray();
		Arrays.sort(k);
		Arrays.sort(c);
		int len = k.length, l = 0, r = len - 1, kl = 0, kr = (len - 1) / 2, cl = (len + 1) / 2, cr = r;
		char[] arr = new char[len];
		for(int i = 0; i < len; i++) {
			char a = k[kl], b = c[cr];
			if(a < b) arr[l++] = i % 2 == 0 ? k[kl++] : c[cr--];
			else arr[r--] = i % 2 == 0 ? k[kr--] : c[cl++];
		}
		System.out.println(new String(arr));
	}
}
