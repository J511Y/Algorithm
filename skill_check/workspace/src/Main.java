import java.util.*;
class Main {
//	public static int solution(int[] cookie) {
//        int answer = 0, len = cookie.length, sum = 0;
//        int[] sumArr = new int [len];
//        for(int i = 0; i < len; i++) sumArr[i] = sum += cookie[i];
//        for(int i : sumArr) System.out.println(i);
//        return answer;
//    }
	public static void main(String[] args) {
//		System.out.println(solution(new int [] {1,1,2,3}));
//		System.out.println(solution(new int [] {1,2,4,5}));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		int[][] arr = new int [n][m];
		int[] sum = new int [n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < n; i++) {
				sum[i] += arr[i][j];
				if(sum[i] >= k) {
					System.out.println((i+1) + " " + (j+1));
					return;
				}
			}
		}
	}
}