package baekjoon_브루트포스;

import java.util.*;
public class baekjoon_9290 {
	static byte[][] map;
	static boolean check(byte b) {
		boolean rtn = false;
		for(byte[] m : map) rtn |= m[0] == b && m[1] == b && m[2] == b;
		for(int i = 0; i < 3; i++) rtn |= map[0][i] == b && map[1][i] == b && map[2][i] == b;
		rtn |= map[0][0] == b && map[1][1] == b && map[2][2] == b;
		rtn |= map[0][2] == b && map[1][1] == b && map[2][0] == b;
		return rtn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 1; tc <= t; tc++) {
			map = new byte[3][];
			for(int i = 0; i < 3; i++) map[i] = sc.next().getBytes();
			byte b = (byte)sc.next().charAt(0);
			for(int i = 0; i < 9; i++) {
				int x = i / 3, y = i % 3;
				if(map[x][y] == '-') {
					map[x][y] = b;
					if(check(b)) break;
					map[x][y] = '-';
				}
			}
			System.out.println("Case " + tc + ":");
			for(byte[] m : map) System.out.println(new String(m));
		}
	}
}
