import java.util.*;
class Main {
	static char[][] sdoku = new char[9][];
	static boolean[][] X = new boolean[9][10], Y = new boolean[9][10], AREA = new boolean[9][10];
	static boolean isEnd = false;
	static int getArea(int i, int j) {
		return (i / 3) * 3 + j / 3;
	}
	static boolean func(int n) {
		if (isEnd) return false;
		if (n == 81) {
			isEnd = true;
			for(char[] s : sdoku) {
				for(char c : s) System.out.print(c);
				System.out.println();
			}
			return false;
		}
		int x = n / 9, y = n % 9;
		if (sdoku[x][y] == '0') {
			for(int i = 1; i <= 9; i++) {
				if (!X[x][i] && !Y[y][i] && !AREA[getArea(x, y)][i]) {
					X[x][i] = Y[y][i] = AREA[getArea(x, y)][i] = true;
					sdoku[x][y] = (char)('0' + i);
					if (func(n + 1)) return true;
					X[x][i] = Y[y][i] = AREA[getArea(x, y)][i] = false;
					sdoku[x][y] = '0';
				}
			}
		} else {
			return func(n + 1);
		}
		return false;
	}
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 9; i++) sdoku[i] = sc.next().toCharArray();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int v = sdoku[i][j] - '0';
				if (v != 0) {
					X[i][v] = true;
					Y[j][v] = true;
					AREA[getArea(i, j)][v] = true;
				}
			}
		}
		func(0);
	}
}