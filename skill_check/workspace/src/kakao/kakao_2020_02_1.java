package kakao;

public class kakao_2020_02_1 {
	static int kakao_02_1(int n, int[] arr) {
		int cnt = 0;
		long left = 0, right = 0;
		for(int i : arr) right += i;
		for(int i = 0; i < n - 1; i++) {
			left += arr[i];
			right -= arr[i];
			if(left > right) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(kakao_02_1(3, new int[] {10, -5, 6}));
		System.out.println(kakao_02_1(5, new int[] {-3, -2, 10, 20, -30}));
	}
}
