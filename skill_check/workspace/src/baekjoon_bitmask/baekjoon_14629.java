import java.util.*;
class baekjoon_14629 {
	static long n, min = 1 << 30;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		dfs(0, 0);
		System.out.println(min);
	}
	static void dfs(long val, int bit) {
		if(Math.abs(n - val) <= Math.abs(n - min)) {
			min = Math.abs(n - val) < Math.abs(n - min) ? val : Math.min(min, val);
		}
		for(int i = 0; i < 10; i++) {
			int chk = 1 << (i + 1);
			if((bit & chk) == 0) dfs(val * 10 + i, bit | chk);
		}
	}
}