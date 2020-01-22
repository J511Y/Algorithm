package baekjoon_DP;
import java.util.*;
public class baekjoon_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] house = new int[n][];
		for(int i = 0; i < n; i++)
			house[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
		for(int i = 1; i < n; i++) {
			house[i][0] += Math.min(house[i-1][1], house[i-1][2]);
			house[i][1] += Math.min(house[i-1][0], house[i-1][2]);
			house[i][2] += Math.min(house[i-1][0], house[i-1][1]);
		}
		System.out.println(Math.min(house[n-1][0], Math.min(house[n-1][1], house[n-1][2])));
	}
}
