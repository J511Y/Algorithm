package workspace;
import java.util.*;
/*
 * ���� ����
�� ���� �ܾ� begin, target�� �ܾ��� ���� words�� �ֽ��ϴ�. �Ʒ��� ���� ��Ģ�� �̿��Ͽ� begin���� target���� ��ȯ�ϴ� ���� ª�� ��ȯ ������ ã������ �մϴ�.

1. �� ���� �� ���� ���ĺ��� �ٲ� �� �ֽ��ϴ�.
2. words�� �ִ� �ܾ�θ� ��ȯ�� �� �ֽ��ϴ�.
���� ��� begin�� hit, target�� cog, words�� [hot,dot,dog,lot,log,cog]��� hit -> hot -> dot -> dog -> cog�� ���� 4�ܰ踦 ���� ��ȯ�� �� �ֽ��ϴ�.

�� ���� �ܾ� begin, target�� �ܾ��� ���� words�� �Ű������� �־��� ��, �ּ� �� �ܰ��� ������ ���� begin�� target���� ��ȯ�� �� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
�� �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
�� �ܾ��� ���̴� 3 �̻� 10 �����̸� ��� �ܾ��� ���̴� �����ϴ�.
words���� 3�� �̻� 50�� ������ �ܾ ������ �ߺ��Ǵ� �ܾ�� �����ϴ�.
begin�� target�� ���� �ʽ��ϴ�.
��ȯ�� �� ���� ��쿡�� 0�� return �մϴ�.
����� ��
begin	target	words	return
hit	cog	[hot, dot, dog, lot, log, cog]	4
hit	cog	[hot, dot, dog, lot, log]	0
����� �� ����
���� #1
������ ���� ���� �����ϴ�.

���� #2
target�� cog�� words �ȿ� ���� ������ ��ȯ�� �� �����ϴ�.
 */
public class begin_target_word {
	public static boolean finish(int [] arr) {
		for(int i : arr) {
			if(i==0)return false;
		}
		return true;
	}
//	public static int solution(String begin, String target, String[] words) {
//        int answer = 0;
//        boolean b = false;
//        for(String s : words) {
//        	if(s.equals(target))b=true;
//        }
//        if(b)return 0;
//        
//        byte [] bArr=begin.getBytes();
//        byte [] tArr=target.getBytes();
//        int [] result = new int [words.length];
//        int n = 0;
//        for(int i=0; i<words.length; i++) {
//        	if(finish(result))break;
//        	if(result[i]==n) {
//        		if(isPossible(words[i])) {
//        			list2.add(words[i]);
//        		}
//        	}
//        }
//        return answer;
//    }
	public static void main(String[] args) {
//		System.out.println(solution("hit","cog",new String[] {"lit","hot","dit","dot","dog","lot","log","cog"}));
	}

}
