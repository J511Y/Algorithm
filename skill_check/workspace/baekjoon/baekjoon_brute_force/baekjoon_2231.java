package baekjoon_brute_force;
import java.util.*;
public class baekjoon_2231 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<r; i++) {
        	int temp = i;
        	int sum = i;
        	// �� �ڸ��� �����ֱ�
        	while(temp > 0) {
        		sum += temp % 10;
        		temp /= 10;
        	}
        	// ������ ��� �� ����
        	if(sum==r) {
        		System.out.println(i);
        		return;
        	}
        }
        //for���� ������ �������Դٸ� �����ڰ� ���ٴ� ���̴� 0���.
        System.out.println(0);

	}

}
