package baekjoon_backtracking;

import java.util.*;
public class baekjoon_15686 {
	static int answer = 1 << 30, size, n, m;
	static List<int[]> house = new ArrayList<>(), chicken = new ArrayList<>();
	static void BT(int bit, int idx, int cnt) {
		if(cnt == m) {
			int sum = 0;
			int[] arr = new int[house.size()];
			calc(bit, arr);
			for(int i : arr) sum += i;
			answer = Math.min(answer, sum);
		}else {
			for(int i = idx; i < size; i++) {
				BT(bit | (1 << i), i + 1, cnt + 1);
			}			
		}
	}
	static void calc(int bit, int[] arr) {
		for(int i = 0; i < arr.length; i++) arr[i] = 1 << 30;
		for(int i = 0; i < size; i++) {
			if((bit & (1 << i)) > 0){
				for(int j = 0; j < arr.length; j++) {
					int[] h = house.get(j), c = chicken.get(i);
					arr[j] = Math.min(arr[j], Math.abs(c[0] - h[0]) + Math.abs(c[1] - h[1]));
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if(x == 1) house.add(new int[] {i, j});
				if(x == 2) chicken.add(new int[] {i, j});
			}
		}
		size = chicken.size();
		BT(0, 0, 0);
		System.out.println(answer);
	}
}
