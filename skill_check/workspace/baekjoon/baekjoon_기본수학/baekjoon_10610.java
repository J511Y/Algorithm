package baekjoon_기본수학;
// https://www.acmicpc.net/problem/10610
// 30
import java.util.*;
class baekjoon_10610 {
    public static void main(String[] ar){
    	byte[] arr = new Scanner(System.in).next().getBytes();
		StringBuffer sb = new StringBuffer("-1");
		int i = arr.length - 1, sum = 0;
		Arrays.sort(arr);
		for(byte b : arr) sum += b - '0';
		if(arr[0] == '0' && sum % 3 == 0){
			sb = new StringBuffer();
			for(; i >= 0; i--) sb.append(arr[i] - '0');
		}
		System.out.print(sb.toString());
    }
}
