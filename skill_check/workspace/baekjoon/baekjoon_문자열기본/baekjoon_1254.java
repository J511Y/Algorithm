package baekjoon_���ڿ��⺻;
// https://www.acmicpc.net/problem/1254
// �Ӹ���� �����
public class baekjoon_1254 {
	static boolean isPalin(String s) {
		int len = s.length();
		for(int i = 0; i < len / 2; i++) {
			if(s.charAt(i) != s.charAt(len - i - 1)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).next();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			if(isPalin(s.substring(i))) {
				System.out.println(len + i);
				return;
			}
		}
	}
}
