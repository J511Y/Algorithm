package baekjoon_����;
import java.util.*;
public class baekjoon_11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) list.add(new int[] {sc.nextInt(), sc.nextInt()});
		list.sort((i1, i2) ->{
			int y = i1[1] - i2[1];
			return y == 0 ? i1[0] - i2[0] : y;
		});
		for(int[] arr : list) System.out.println(arr[0] + " " + arr[1]);
	}
}
