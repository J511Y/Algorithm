package baekjoon_simulation;
// https://www.acmicpc.net/problem/3055
// Ż��
/*
 * ����
����� ������ ���� �̹����� ���� ���� ������ �տ� �־���, 
�� �ɷ��� �����غ��� ���� ��ó�� Ƽ������ ȫ���� ����Ű���� �Ѵ�. 
�� ������ ����ġ�� �� ���� ��� �ִ�. 
����ġ�� ���� ģ�� ģ���� ����� ���� ������ ���� ������ ȫ���� ���Ϸ��� �Ѵ�.

Ƽ������ ������ R�� C���� �̷���� �ִ�. 
����ִ� ���� '.'�� ǥ�õǾ� �ְ�, ���� ���ִ� ������ '*', ���� 'X'�� ǥ�õǾ� �ִ�. 
����� ���� 'D'��, ����ġ�� ��ġ�� 'S'�� ��Ÿ������ �ִ�.

�� �и��� ����ġ�� ���� �ִ� ĭ�� ������ �� ĭ �� �ϳ��� �̵��� �� �ִ�. (��, �Ʒ�, ������, ����) 
���� �� �и��� ����ִ� ĭ���� Ȯ���Ѵ�. 
���� �ִ� ĭ�� �������ִ� ����ִ� ĭ(��� �� ���� ����)�� ���� ���� �ȴ�. 
���� ����ġ�� ���� ����� �� ����. 
��, ����ġ�� ���� ���ִ� �������� �̵��� �� ����, ���� ����� �ұ��� �̵��� �� ����.

Ƽ������ ������ �־����� ��, ����ġ�� �����ϰ� ����� ���� �̵��ϱ� ���� 
�ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����ġ�� ���� �� ������ ĭ���� �̵��� �� ����. 
��, ���� �ð��� ���� �� ������ ĭ���� ����ġ�� �̵��� �� ����. 
�̵��� �� ������ ����ġ�� ���� ������ �����̴�. 

�Է�
ù° �ٿ� 50���� �۰ų� ���� �ڿ��� R�� C�� �־�����.

���� R�� �ٿ��� Ƽ������ ������ �־�����, �������� ������ ���ڸ� �־�����. 
'D'�� 'S'�� �ϳ����� �־�����.

���
ù° �ٿ� ����ġ�� ����� ���� �̵��� �� �ִ� ���� ���� �ð��� ����Ѵ�. 
����, �����ϰ� ����� ���� �̵��� �� ���ٸ�, "KAKTUS"�� ����Ѵ�.
 */
/*
 * ���� Ǯ�� �� ���� 2020.02.29 17:15
 * -----------------------------
 * BFS�� �� �� ���ÿ� ������ �����ε�
 */
import java.util.*;
public class baekjoon_3055 {
	static int[][] WH = new int[][] {{1, 0, -1, 0}, {0, 1, 0, -1}};
	static boolean[][] W, A;
	static boolean range(int n, int m, int x, int y) {
		return 0 <= x && 0 <= y && x < n && y < m;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Queue<int[]> water = new LinkedList<>();
		Queue<int[]> animal = new LinkedList<>();
		W = new boolean[n][m];
		A = new boolean[n][m];
		char[][] map = new char[n][];
		for(int i = 0; i < n; i++) map[i] = sc.next().toCharArray();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 'S') {
					animal.add(new int[] {i, j, 0});
					A[i][j] = true;
				}
				if(map[i][j] == '*') {
					water.add(new int[] {i, j, 0});
					W[i][j] = true;
				}
			}
		}
		int cnt = 0;
		while(true) {
			while(true) {
				if(water.size() == 0) break;
				if(water.peek()[2] != cnt) break;
				int[] wtr = water.poll();
				for(int i = 0; i < 4; i++) {
					int x = wtr[0] + WH[0][i];
					int y = wtr[1] + WH[1][i];
					if(range(n, m, x, y)) {
						if(map[x][y] == '.' && !W[x][y]) {
							water.add(new int[] {x, y, cnt + 1});
							map[x][y] = '*';
							W[x][y] = true;
						}
					}
				}
			}
			while(true) {
				if(animal.size() == 0) {
					System.out.println("KAKTUS");
					return;
				}
				if(animal.peek()[2] != cnt) break;
				int[] aml = animal.poll();
				for(int i = 0; i < 4; i++) {
					int x = aml[0] + WH[0][i];
					int y = aml[1] + WH[1][i];
					if(range(n, m, x, y)) {
						if(map[x][y] == '.' && !A[x][y]) {
							animal.add(new int[] {x, y, cnt + 1});
							A[x][y] = true;
						}
						if(map[x][y] == 'D') {
							System.out.println(cnt + 1);
							return;
						}
					}
				}
			}
			cnt++;
		}
	}
}
