package baekjoon_math2;
import java.util.*;
@SuppressWarnings("serial")
class IdiotException extends Exception{
	String msg;
	public IdiotException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
@SuppressWarnings("serial")
class BaboException extends Exception{
	String msg;
	public BaboException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
public class baekjoon_11650 {

	/**
	 * 자연수의 합계를 구하는 메서드.
	 * @param n 반복 횟수 변수
	 * @param x 초기화 변수
	 * @param plus 증감변수
	 * @throws IdiotException n이 0보다 낮게 들어올 경우 멍청이임을 증명
	 * @throws BaboException plus가 0일 경우 바보임을 증명
	 */
	public static int sum(int x, int n, int plus) throws IdiotException, BaboException {
		if(n==0) return x;
		if(n<0) throw new IdiotException("멍청이!");
		if(plus==0) throw new BaboException("바보!");
		return x + sum(x+plus, n-1, plus);
	}
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		int rnd = sc.nextInt();
//		while(rnd-->0) {
//			
//		}
//		System.out.println(sum(50, 100, -10));
	}

}
