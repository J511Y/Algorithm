package baekjoon_DP;
import java.util.*;
public class baekjoon_1932_topdown {
	static int[][] val;
	public static void func(int[][] tri, int x) {
		if(x==val.length-1) return;
		for(int i=0; i<val[x].length; i++) {
			val[x+1][i] = Math.max(val[x][i] + tri[x+1][i], val[x+1][i]);
			val[x+1][i+1] = val[x][i] + tri[x+1][i+1];
		}
		func(tri, x+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]tri = new int [n][];
		val = new int [n][];
		for(int i=0; i<n; i++) {
			int [] arr = new int [i+1];
			val[i] = Arrays.copyOf(arr, arr.length);
			for(int j=0; j<i+1; j++) {
				arr[j] = sc.nextInt();
			}
			tri[i] = arr;
		}
		val[0][0] = tri[0][0];
		func(tri, 0);
		System.out.println(Arrays.stream(val[n-1]).max().getAsInt());
	}
}
