package programmers;
import java.util.*;
// https://programmers.co.kr/learn/courses/30/lessons/42861
// �� �����ϱ�
/*
 * ���� ����
n���� �� ���̿� �ٸ��� �Ǽ��ϴ� ���(costs)�� �־��� ��, �ּ��� ������� ��� ���� ���� ���� �����ϵ��� ���� �� �ʿ��� �ּ� ����� return �ϵ��� solution�� �ϼ��ϼ���.

�ٸ��� ���� �� �ǳʴ���, ������ ���� ������ ���� �����ϴٰ� ���ϴ�. ���� ��� A ���� B �� ���̿� �ٸ��� �ְ�, B ���� C �� ���̿� �ٸ��� ������ A ���� C ���� ���� ���� �����մϴ�.

���ѻ���

���� ���� n�� 1 �̻� 100 �����Դϴ�.
costs�� ���̴� ((n-1) * n) / 2�����Դϴ�.
������ i�� ����, costs[i][0] �� costs[i] [1]���� �ٸ��� ����Ǵ� �� ���� ��ȣ�� ����ְ�, costs[i] [2]���� �� �� ���� �����ϴ� �ٸ��� �Ǽ��� �� ��� ����Դϴ�.
���� ������ �� �� �־����� �ʽ��ϴ�. ���� ������ �ٲ���� ���� ����� ���ϴ�. �� 0�� 1 ���̸� �����ϴ� ����� �־����� ��, 1�� 0�� ����� �־����� �ʽ��ϴ�.
��� �� ������ �ٸ� �Ǽ� ����� �־����� �ʽ��ϴ�. �� ���, �� �� ������ �Ǽ��� �Ұ����� ������ ���ϴ�.
������ �� ���� ���� �־����� �ʽ��ϴ�.
 */
// ������ Ǯ���� �����ε� ���ķε� Ǯ�� �� ���Ƽ� Ǯ�����.
public class prgmers_42861 {
	static int[] vst;
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b) vst[b] = a;
    }
    static int find(int x){
        if(x == vst[x]) return vst[x];
        return vst[x] = find(vst[x]);
    }
    public static int solution(int n, int[][] costs) {
        int answer = 0, sum = 1;
        vst = new int [n];
        for(int i = 0; i < n; i++) vst[i] = i;
        List<int[]> list = new ArrayList<int[]>();
        for(int[] arr : costs) list.add(arr);
        list.sort(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
        
        for(int i = 0; i < list.size(); i++) {
        	if(sum == n) break;
        	int[] arr = list.get(i);
            int a = arr[0], b = arr[1];
        	if(find(a) != find(b)) {
        		sum ++;
        		union(a, b);
        		answer += arr[2];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(4, new int [][] {{0,1,1},{0,2,2},{1,2,1},{1,3,5},{2,3,2}}));
	}
}
