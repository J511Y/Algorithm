package baekjoon_unionfind;
import java.util.*;
// https://www.acmicpc.net/problem/1976
// ���డ��
/*
 * ����
�����̴� ģ����� �Բ� ������ ������ �Ѵ�. �ѱ����� ���ð� N�� �ְ� ������ �� ���� ���̿� ���� ���� ����, ���� ���� �ִ�. 
�������� ���� ������ �־����� ��, �� ���� ��ΰ� ������ ������ �˾ƺ���. ���� �߰��� �ٸ� ���ø� �����ؼ� ������ �� ���� �ִ�.
���� ��� ���ð� 5�� �ְ�, A-B, B-C, A-D, B-D, E-A�� ���� �ְ�, �������� ���� ��ȹ�� E C B C D ���
E-A-B-C-B-C-B-D��� �����θ� ���� ������ �޼��� �� �ִ�.

���õ��� ������ ���õ� ���� ���� ���ΰ� �־��� �ְ�, �������� ���� ��ȹ�� ���� ���õ��� ������� �־����� ��(�ߺ� ����) �������� ���θ� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù �ٿ� ������ �� N�� �־�����. N�� 200�����̴�. ��° �ٿ� ���� ��ȹ�� ���� ���õ��� �� M�� �־�����. 
M�� 1000�����̴�. ���� N * N ����� ���� ������ �� ���ð� ����Ǿ������� ���� ������ �־�����. 
1�̸� ����� ���̰� 0�̸� ������ ���� ���� ���̴�. A�� B�� ����Ǿ����� B�� A�� ����Ǿ� �ִ�. 
������ �ٿ��� ���� ��ȹ�� �־�����.

���
ù �ٿ� �����ϸ� YES �Ұ����ϸ� NO�� ����Ѵ�.
 */

/*
 * ���� Ǯ�� �� ����
 * ------------
 * 2020.01.16 21:45
 * ���� ����Ÿ��Ʋ���� �����ֵ��� �׳� DFS �� BFS�� Ǯ�� �����ߴٰ� UnionFind�� Ǯ���� �ߴ�.
 * Ư�� �������� ����Ǿ��ִ��� Ȯ���ϱ� ���ؼ� UnionFind�� ���� �� ����.
 * �� Ȯ�ο��� �Ź� D/BFS�� ������ �� ���� ����Ǿ��ִٴ� ���� �����ϱ� ���� ���� �� �ƴұ�ʹ�.
 * ���� �� ������ DFSó�� �迭�� ��� ���� Ȯ���ϸ鼭 1�̶�� Union, ���������� Find ���ָ� �ǰڴٴ� �����̴�.
 * 
 * ���� Ǯ�� �� �� ����
 * -----------
 * 2020.01.16 21:59
 * �׳� �����Ѵ�� Ǫ�� �¾Ҵ�. �ٵ� ���� �� �ƽ��� ����?
 * ���� ������ �Է°����� ���� ����Ǿ��ִ��� Ȯ���ϴ� �ڵ尡 ��¾�� ������ ������ ���.
 * union�Ҷ��� �迭 ��� ���� Ȯ������ �ʰ��� ������ ����� ������ �����غ��߰ڴ�.
 * 
 * ��Ǯ�� 2020.04.19 23:59
 * ---------------------
 * ���� �߸�¥�� �ٽ� Ǯ����.
 */
public class baekjoon_1976 {
	static int[] uf = new int[201];
	static void union(int a, int b){
        a = find(a);
        b = find(b);
        uf[a] = b;
    }
    static int find(int x){
        if(x == uf[x]) return x;
        return uf[x] = find(uf[x]);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		for(int i = 1; i <= n; i++) uf[i] = i;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int a = sc.nextInt();
				if(a == 1) union(i, j);
			}
		}
		
		int x = find(sc.nextInt());
		for(int i = 1; i < m; i++) {
			if(x != find(sc.nextInt())) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}