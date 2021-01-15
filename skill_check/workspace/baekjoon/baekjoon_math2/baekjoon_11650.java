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
	 * �ڿ����� �հ踦 ���ϴ� �޼���.
	 * @param n �ݺ� Ƚ�� ����
	 * @param x �ʱ�ȭ ����
	 * @param plus ��������
	 * @throws IdiotException n�� 0���� ���� ���� ��� ��û������ ����
	 * @throws BaboException plus�� 0�� ��� �ٺ����� ����
	 */
	public static int sum(int x, int n, int plus) throws IdiotException, BaboException {
		if(n==0) return x;
		if(n<0) throw new IdiotException("��û��!");
		if(plus==0) throw new BaboException("�ٺ�!");
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
