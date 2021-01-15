package baekjoon_math2;
import java.util.*;
public class baekjoon_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = sc.nextInt();
		List<int[]> list = new ArrayList<>();
		while(rnd--> 0)
			list.add(new int [] {sc.nextInt(), sc.nextInt()});
		list.sort((arr1, arr2) -> {
			if(arr1[0] - arr2[0] == 0) return arr1[1] - arr2[1];
			return arr1[0] - arr2[0];
		});
		for(int[] arr : list) System.out.println(arr[0]+" "+arr[1]);
	}
}
