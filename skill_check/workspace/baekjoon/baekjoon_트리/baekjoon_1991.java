package baekjoon_Æ®¸®;
import java.util.*;
public class baekjoon_1991 {
	static String[][] arr;
	static void pre(int x) {
		System.out.print(arr[x][0]);
		if(!arr[x][1].equals(".")) pre(arr[x][1].charAt(0) - 'A');
		if(!arr[x][2].equals(".")) pre(arr[x][2].charAt(0) - 'A');
	}
	static void in(int x) {
		if(!arr[x][1].equals(".")) in(arr[x][1].charAt(0) - 'A');
		System.out.print(arr[x][0]);
		if(!arr[x][2].equals(".")) in(arr[x][2].charAt(0) - 'A');
	}
	static void post(int x) {
		if(!arr[x][1].equals(".")) post(arr[x][1].charAt(0) - 'A');
		if(!arr[x][2].equals(".")) post(arr[x][2].charAt(0) - 'A');
		System.out.print(arr[x][0]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		arr = new String[n][];
		for(int i = 0; i < n; i++) arr[i] = sc.nextLine().split(" ");
		Arrays.sort(arr, (a1, a2)->{return a1[0].compareTo(a2[0]);});
		pre(0); System.out.println();
		in(0); System.out.println();
		post(0); System.out.println();
	}
}
