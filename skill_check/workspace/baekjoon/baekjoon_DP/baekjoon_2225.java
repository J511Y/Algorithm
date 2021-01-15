package baekjoon_DP;
// https://www.acmicpc.net/problem/2225
// ÇÕºÐÇØ
import java.util.*;
class baekjoon_2225{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[201][201];
		for(int i = 0; i < 201; i++) map[i][1] = map[0][i] = 1;
		for(int i = 1; i < 201; i++){
			for(int j = 2; j < 201; j++){
				map[i][j] = (map[i-1][j] + map[i][j-1]) % 1000000000;
			}
		}
		int n = sc.nextInt(), k = sc.nextInt();
		System.out.print(map[n][k]);
	}
}