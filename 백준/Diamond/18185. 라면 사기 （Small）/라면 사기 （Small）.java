import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		int[] arr = new int[n + 2];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = arr[i], b = arr[i+1], c = arr[i+2];
			if(b <= c) {
				// 기존에 생각한대로 3, 2, 1 순
				int cnt = 0;
				while(a > 0 && b > 0 && c > 0) {
					a--; b--; c--;
					cnt++;
				}
				sum += 7 * cnt;
				cnt = 0;
				while(a > 0 && b > 0) {
					a--; b--;
					cnt++;
				}
				sum += 5 * cnt;
			} else {
				int cnt = 0;
				while(a > 0 && b > c) {
					a--; b--;
					cnt++;
				}
				sum += 5 * cnt;
				cnt = 0;
				while(a > 0 && c > 0) {
					a--; b--; c--;
					cnt++;
				}
				sum += 7 * cnt;				
			}
			sum += 3 * a;
			arr[i+1] = b;
			arr[i+2] = c;
		}
		System.out.println(sum);
	}
}