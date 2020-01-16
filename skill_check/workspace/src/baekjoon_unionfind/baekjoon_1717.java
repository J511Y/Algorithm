package baekjoon_unionfind;
// https://www.acmicpc.net/problem/1717
// ������ ǥ��
/*
 * ����
�ʱ⿡ {0}, {1}, {2}, ... {n} �� ���� n+1���� ������ �̷�� �ִ�. 
���⿡ ������ �����, �� ���Ұ� ���� ���տ� ���ԵǾ� �ִ����� Ȯ���ϴ� ������ �����Ϸ��� �Ѵ�.

������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n(1��n��1,000,000), m(1��m��100,000)�� �־�����. m�� �Է����� �־����� ������ �����̴�. 
���� m���� �ٿ��� ������ ������ �־�����. �������� 0 a b�� ���·� �Է��� �־�����. 
�̴� a�� ���ԵǾ� �ִ� ���հ�, b�� ���ԵǾ� �ִ� ������ ��ģ�ٴ� �ǹ��̴�. 
�� ���Ұ� ���� ���տ� ���ԵǾ� �ִ����� Ȯ���ϴ� ������ 1 a b�� ���·� �Է��� �־�����. 
�̴� a�� b�� ���� ���տ� ���ԵǾ� �ִ����� Ȯ���ϴ� �����̴�. 
a�� b�� n ������ �ڿ����Ǵ� 0�̸� ���� ���� �ִ�.

���
1�� �����ϴ� �Է¿� ���ؼ� �� �ٿ� �ϳ��� YES/NO�� ����� ����Ѵ�. (yes/no �� ����ص� �ȴ�)
 */

// ������ Ǯ���� ������ �Ŀ� �ٽ� Ǯ����� ��.
import java.util.*;
public class baekjoon_1717 {
	static int[] arr;
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b ) arr[b] = a;
    }
    static int find(int x){
        if(x == arr[x]) return x;
        return arr[x] = find(arr[x]);
    }
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        arr = new int[n+1];
        for(int i = 0; i < n + 1; i++) arr[i] = i;
        for(int i = 0; i < m; i++){
            int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            if(x == 0) union(a, b);
            else System.out.println(find(a) == find(b) ? "YES" : "NO");
        }
    }
}
