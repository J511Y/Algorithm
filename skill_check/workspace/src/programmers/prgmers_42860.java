package programmers;
import java.util.*;
public class prgmers_42860 {
	public static int solution(String name) {
		byte[] arr = name.getBytes();
        int answer = 0, min = 1 << 30, total = 0, len = arr.length;
        byte A = 'A';
        for(byte B : arr) {
        	int ud = Math.max(A, B) - Math.min(A, B);
        	ud = ud > 13 ? 26 - ud : ud;
        	if(ud > 0) {
        		answer += ud;
        		total++;
        	}
        }
        for(int i = 0; i < len; i++) {
        	int cnt = 0, j = 0, move = i > len / 2 ? len - i : i;
        	for(; j < arr.length; j++) {
        		if(arr[(i + j) % arr.length] != 'A') cnt++;
        		if(cnt == total) break;
        	}
        	min = Math.min(min, move + j);
        	for(j = 0, cnt = 0; j < arr.length; j++) {
        		if(arr[(len + i - j) % arr.length] != 'A') cnt++;
        		if(cnt == total) break;
        	}
        	min = Math.min(min, move + j);
        }
        return answer + min;
    }
	public static void main(String[] args) {
		System.out.println(solution("JEROEN"));
		System.out.println(solution("ABAAAAAAABA"));
		System.out.println(solution("AAB"));
		System.out.println(solution("AABAAAAAAABBB")); // 11
		System.out.println(solution("CZ"));
//		System.out.println(solution("BBBBAAAAAB"));
		System.out.println(solution("JAN"));
	}
}
/*
ABCDEFGHIJKLMNOPQRSTUVWXYZ
���̽�ƽ
���� ����
���̽�ƽ���� ���ĺ� �̸��� �ϼ��ϼ���. �� ó���� A�θ� �̷���� �ֽ��ϴ�.
ex) �ϼ��ؾ� �ϴ� �̸��� �� ���ڸ� AAA, �� ���ڸ� AAAA

���̽�ƽ�� �� �������� �����̸� �Ʒ��� �����ϴ�.

�� - ���� ���ĺ�
�� - ���� ���ĺ� (A���� �Ʒ������� �̵��ϸ� Z��)
�� - Ŀ���� �������� �̵� (ù ��° ��ġ���� �������� �̵��ϸ� ������ ���ڿ� Ŀ��)
�� - Ŀ���� ���������� �̵�
���� ��� �Ʒ��� ������� JAZ�� ���� �� �ֽ��ϴ�.

- ù ��° ��ġ���� ���̽�ƽ�� ���� 9�� �����Ͽ� J�� �ϼ��մϴ�.
- ���̽�ƽ�� �������� 1�� �����Ͽ� Ŀ���� ������ ���� ��ġ�� �̵���ŵ�ϴ�.
- ������ ��ġ���� ���̽�ƽ�� �Ʒ��� 1�� �����Ͽ� Z�� �ϼ��մϴ�.
���� 11�� �̵����� "JAZ"�� ���� �� �ְ�, �̶��� �ּ� �̵��Դϴ�.
������� �ϴ� �̸� name�� �Ű������� �־��� ��, �̸��� ���� ���̽�ƽ ���� Ƚ���� �ּڰ��� return �ϵ��� solution �Լ��� ���弼��.

���� ����
name�� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
name�� ���̴� 1 �̻� 20 �����Դϴ�.
����� ��
name	return
JEROEN	56
JAN	23
*/