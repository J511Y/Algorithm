package baekjoon_구현;
// https://www.acmicpc.net/problem/14499
// 주사위 굴리기
// 스터디 시간에 풀었던 문제 2020.02.24
import java.util.*;
import java.io.*;
public class baekjoon_14499 {
	static int n, m, x, y, k;
	static int[][] map;
	static int[][] D = new int[][]{{1, -1, 0, 0}, {0, 0, -1, 1}};
	static int[] dice = new int[6];
    static StringBuffer sb = new StringBuffer();
    static int Int(String s){
        return Integer.parseInt(s);
    }
	public static void main(String[] ar) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(br.readLine());
		n = Int(st.nextToken());
		m = Int(st.nextToken());
		x = Int(st.nextToken());
		y = Int(st.nextToken());
		k = Int(st.nextToken());
		
		map = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Int(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) rollDice(Int(st.nextToken()) - 1);
        System.out.println(sb.toString());
	}
	static void rollDice(int d){
		int X = x + D[1][d];
		int Y = y + D[0][d];
		if(0 <= X && 0 <= Y && X < n && Y < m){
			x = X;
			y = Y;
			spinDice(d);
			if(map[X][Y] == 0) map[X][Y] = dice[5];
			else{
				dice[5] = map[X][Y];
				map[X][Y] = 0;
			}
			sb.append(dice[0] + "\n");
		}
	}
	static void spinDice(int w){
		if(w == 0){
			int a = dice[0], b = dice[2], c = dice[3], d = dice[5];
			dice[0] = c;
			dice[2] = a;
			dice[3] = d;
			dice[5] = b;
		}
		if(w == 1){
			int a = dice[0], b = dice[2], c = dice[3], d = dice[5];
			dice[0] = b;
			dice[2] = d;
			dice[3] = a;
			dice[5] = c;
		}
		if(w == 2){
			int a = dice[0], b = dice[1], c = dice[4], d = dice[5];
			dice[0] = c;
			dice[1] = a;
			dice[4] = d;
			dice[5] = b;
		}
		if(w == 3){
			int a = dice[0], b = dice[1], c = dice[4], d = dice[5];
			dice[0] = b;
			dice[1] = d;
			dice[4] = a;
			dice[5] = c;
		}
	}
}
