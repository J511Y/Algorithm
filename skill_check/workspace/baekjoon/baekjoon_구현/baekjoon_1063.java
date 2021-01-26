package baekjoon_±¸Çö;
// https://www.acmicpc.net/problem/1063
// Å·
import java.util.*;
class Chess{
	int x, y;
	Chess(String s){
		this.x = Math.abs(s.charAt(1) - '8');
		this.y = s.charAt(0) - 'A';
	}
	public String toString() {
		return (char)((byte)y + 'A') + "" + (char)('8' - (byte)x);
	}
}
public class baekjoon_1063 {
	static boolean isRange(int a, int b) {
		return 0 <= a && 0 <= b && a < 8 && b < 8;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chess king = new Chess(sc.next()), stone = new Chess(sc.next());
		int n = sc.nextInt();
		for(int i = 0 ; i < n; i++) {
			int[] move = new int[2];
			switch(sc.next()) {
				case "R": move[0] = 0; move[1] = 1; break;
				case "L": move[0] = 0; move[1] = -1; break;
				case "B": move[0] = 1; move[1] = 0; break;
				case "T": move[0] = -1; move[1] = 0; break;
				case "RT": move[0] = -1; move[1] = 1; break;
				case "LT": move[0] = -1; move[1] = -1; break;
				case "RB": move[0] = 1; move[1] = 1; break;
				case "LB": move[0] = 1; move[1] = -1; break;
			}
			if(king.x + move[0] == stone.x && king.y + move[1] == stone.y) {
				if(isRange(stone.x + move[0], stone.y + move[1])) {
					stone.x += move[0];
					stone.y += move[1];
				}else continue;
			}
			if(isRange(king.x + move[0], king.y + move[1])) {
				king.x += move[0];
				king.y += move[1];
			}
		}
		System.out.println(king);
		System.out.println(stone);
	}
}
