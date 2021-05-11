package baekjoon_문자열기본;

import java.util.*;
public class baekjoon_3107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ipv6 = sc.next();
		if(ipv6.endsWith("::")) ipv6 += "0";
		String[] arr = new String[8], split = ipv6.split("::");
		Arrays.fill(arr, "");
		if(split.length == 1) arr = split[0].split(":");
		else {
			String[] a = split[0].split(":"), b = split[1].split(":");
			for(int i = 0; i < a.length; i++) arr[i] = a[i];
			for(int j = 0; j < b.length; j++) arr[7 - j] = b[b.length - j - 1];
		}
		for(int i = 0; i < 8; i++) while(arr[i].length() < 4) arr[i] = "0" + arr[i];
		for(int i = 0; i < 8; i++) System.out.print(arr[i] + (i < 7 ? ":" : ""));
	}
}
