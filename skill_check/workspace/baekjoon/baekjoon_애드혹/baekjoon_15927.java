package baekjoon_æ÷µÂ»§;

import java.util.*;
public class baekjoon_15927 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int len = arr.length, rst = len;
		boolean isPalin = true, allSame = true;
		for(int i = 0; i < len; i++) isPalin &= arr[i] == arr[len - i - 1];
		for(int i = 1; i < len; i++) allSame &= arr[0] == arr[i];
		if(isPalin) rst = len - 1;
		if(allSame) rst = -1;
		System.out.print(rst);
	}
}
