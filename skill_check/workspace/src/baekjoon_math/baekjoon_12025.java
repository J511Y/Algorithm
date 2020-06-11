package baekjoon_math;
// https://www.acmicpc.net/problem/12025
// 장난꾸러기 영훈
import java.util.*;
public class baekjoon_12025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		long k = sc.nextLong() - 1;
		List<Integer> index = new ArrayList<>();
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '1' || arr[i] == '2' || arr[i] == '6' || arr[i] == '7') {
				cnt++;
				index.add(i);
				if(arr[i] == '6') arr[i] = '1';
				if(arr[i] == '7') arr[i] = '2';
			}
		}
		if(k >= Math.pow(2, cnt)) System.out.println(-1);
		else {
			for(int i = 0; i < cnt; i++) {
				if((k & (1l << i)) > 0) {
					int idx = index.get(cnt - i - 1);
					char c = arr[idx];
					if(c == '1') c = '6';
					else if(c == '2') c = '7';
					else if(c == '6') c = '1';
					else if(c == '7') c = '2';
					
					arr[idx] = c;
				}
			}
			System.out.print(new StringBuffer().append(arr));
		}
	}
}
