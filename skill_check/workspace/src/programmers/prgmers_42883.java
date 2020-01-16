package programmers;
import java.util.*;
public class prgmers_42883 {
	public static String solution(String number, int k) {
		Stack<Integer> stack = new Stack<>();
		for(char c : number.toCharArray()) {
			int x = c - '0';
			while(k > 0 && stack.size() > 0 && x > stack.peek()) {
				stack.pop();
				k--;
			}
			stack.push(x);
		}
		StringBuffer sb = new StringBuffer();
		stack.forEach(s->sb.append(s));
        while(k-- > 0) sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution("21111111", 3)); 	// 21111
		System.out.println(solution("1924", 2));	 	// 94
		System.out.println(solution("1231234", 3));		// 3234
		System.out.println(solution("4177252841", 4));	// 775841
	}
}
/*
 * ū �� �����
���� ����
� ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.

���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] �� ���� �� �ֽ��ϴ�. �� �� ���� ū ���ڴ� 94 �Դϴ�.

���ڿ� �������� ���� number�� ������ ���� ���� k�� solution �Լ��� �Ű������� �־����ϴ�. number���� k ���� ���� �������� �� ���� �� �ִ� �� �� ���� ū ���ڸ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
number�� 1�ڸ� �̻�, 1,000,000�ڸ� ������ �����Դϴ�.
k�� 1 �̻� number�� �ڸ��� �̸��� �ڿ����Դϴ�.
����� ��
number	k	return
1924	2	94
1231234	3	3234
4177252841	4	775841
*/
