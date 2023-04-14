import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt(), idx = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int a = sc.nextInt();
			if(a == 1) arr[(sc.nextInt() + idx - 1) % n] += sc.nextInt();
			if(a == 2) idx = (idx - sc.nextInt() + n) % n;
			if(a == 3) idx = (idx + sc.nextInt()) % n;
		}
		for(int i = 0; i < n; i++) System.out.print(arr[(i + idx) % n] + " ");
	}
}