package baekjoon_brute_force;
import java.util.*;
// �Ϲ����� ��ĳ�ʸ� ����ؼ� Ǭ Ǯ���Դϴ�.
// ���͵� �ð��� �ߴ� ��İ� ���������� ����� ��Ʈ���� �ٸ� ���Դϴ�.
public class baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int blackjack = sc.nextInt();
        int [] arr = new int [r];
        for(int i=0; i<r; i++) arr[i] = sc.nextInt();
        int max = 0;
        for(int i = 0; i < r-2; i++) {
        	for(int j = i+1; j < r-1; j++) {
        		for(int k = j+1; k < r; k++) {
        			int sum = arr[i] + arr[j] + arr[k];
        			// ���� result���� ũ���� blackjack ���ٴ� ���� ��.
        			if(sum <= blackjack)max = Math.max(sum, max);
        		}
        	}
        }
        System.out.println(max);
    }
}
