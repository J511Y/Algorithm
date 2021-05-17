package baekjoon_문자열기본;

import java.util.*;
public class baekjoon_10096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		if(n % 2 == 0) System.out.print("NOT POSSIBLE");
		else {
			boolean left = true, right = true, allsame = true;
			for(int i = 1; i < n; i++) allsame &= arr[i] == arr[i-1];
			for(int i = 0, l = 0, r = n / 2; i < n / 2; i++, l++, r++) left &= arr[l] == arr[r];
			for(int i = 0, l = 1, r = n / 2 + 1; i < n / 2; i++, l++, r++) right &= arr[l] == arr[r];
			if(allsame) System.out.print(new String(Arrays.copyOfRange(arr, 0, n / 2)));
			else if(left && right) System.out.print("NOT UNIQUE");
			else if(left) System.out.print(new String(Arrays.copyOfRange(arr, 0, n / 2)));
			else if(right) System.out.print(new String(Arrays.copyOfRange(arr, n / 2 + 1, n)));
			else {
				boolean flag = false;
				for(int i = 0, l = 0, r = n / 2; i < n / 2; i++, l++, r++) {
					if(arr[l] != arr[r]) {
						if(!flag) {
							flag = true;
							i--;
							l--;
						} else {
							flag = false;
							break;
						}
					}
				}
				if(flag) System.out.print(new String(Arrays.copyOfRange(arr, 0, n / 2)));
				else {
					for(int i = 0, l = 0, r = n / 2 + 1; i < n / 2; i++, l++, r++) {
						if(arr[l] != arr[r]) {
							if(!flag) {
								flag = true;
								i--;
								r--;
							} else {
								System.out.println("NOT POSSIBLE");
								return;
							}
						}
					}
					System.out.print(new String(Arrays.copyOfRange(arr, n / 2 + 1, n)));
				}
			}
		}
	}
}
