package baekjoon_brute_force;
import java.util.*;
public class baekjoon_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [9];
		for(int i=0; i<9; i++) arr[i] = sc.nextInt();
		int cha = Arrays.stream(arr).sum() - 100; // 9�� ������ Ű�� �� ���� 100�� ��.
		boolean stop = false; // for�������� ������ �߰������� �ο����� �Ҹ���
		
		for(int i=0; i<arr.length - 1 && !stop; i++) {
			for(int j=i+1; j<arr.length && !stop; j++) {
				int temp = arr[i] + arr[j]; // i+j�� ���� cha�� ���ٸ� �� ���� ����������!
				if(temp == cha) {
					int a=arr[i], b=arr[j]; // ��� ���� �������� ����
					Arrays.sort(arr); // Arrays Ŭ������ sort �޼��� ���
					for(int ii : arr) 
						if(ii != a && ii != b) 
							System.out.println(ii);
					stop = true; // stop�� true�� �ٲ㼭 2�� for���� ��� ���������Բ� ����.
				}
			}
		}
	}
}
