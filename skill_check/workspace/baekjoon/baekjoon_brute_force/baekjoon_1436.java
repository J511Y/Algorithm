package baekjoon_brute_force;
import java.util.*;
public class baekjoon_1436 {
	static boolean func(int i){
		// �� �� 3�ڸ��� 666���� Ȯ��
		// �ƴ϶�� 1�� �ڸ��� ������ �ٽ� ��Ȯ��
        while(i > 0){
            if(i % 1000 == 666) return true;
            i /= 10;
        }
        return false;
    }
    public static void main(String[]args){
        int cnt = 0;
        int movie = 666;
        int n = new Scanner(System.in).nextInt();
        while(cnt < n){
            if (func(movie)) cnt++;
            movie++;
        }
        // ������ while���� ������ movie�� 1 �����Ǿ��־ �׳� ���� �������.
        System.out.println(movie - 1);
    }
}
