package baekjoon_�⺻����;

public class baekjoon_17427 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
	    long l = 0;
	    for(int i = 1; i <= n; i++) l += n / i * i;
	    System.out.print(l);
	}
}
