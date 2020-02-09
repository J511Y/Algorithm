package baekjoon_dijkstra;
// https://www.acmicpc.net/problem/1753
// �ִܰ��
/*
 * ����
����׷����� �־����� �־��� ���������� �ٸ� ��� ���������� �ִ� ��θ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, ��� ������ ����ġ�� 10 ������ �ڿ����̴�.

�Է�
ù° �ٿ� ������ ���� V�� ������ ���� E�� �־�����. (1��V��20,000, 1��E��300,000) 
��� �������� 1���� V���� ��ȣ�� �Ű��� �ִٰ� �����Ѵ�. 
��° �ٿ��� ���� ������ ��ȣ K(1��K��V)�� �־�����. 
��° �ٺ��� E���� �ٿ� ���� �� ������ ��Ÿ���� �� ���� ���� (u, v, w)�� ������� �־�����. 
�̴� u���� v�� ���� ����ġ w�� ������ �����Ѵٴ� ���̴�. 
u�� v�� ���� �ٸ��� w�� 10 ������ �ڿ����̴�. 
���� �ٸ� �� ���� ���̿� ���� ���� ������ ������ ���� ������ �����Ѵ�.

���
ù° �ٺ��� V���� �ٿ� ����, i��° �ٿ� i�� ���������� �ִ� ����� ��ΰ��� ����Ѵ�. 
������ �ڽ��� 0���� ����ϰ�, ��ΰ� �������� �ʴ� ��쿡�� INF�� ����ϸ� �ȴ�.
 */

/*
 * ���� Ǯ�� �� ���� 2020.02.09 19:01
 * ----------------------------
 * ���͵� �� Ǯ���� �����ε� �޸� �ʰ��� ���� �����߾���.
 * ���ͽ�Ʈ�� ���䵵 ���� �� �ٽ� �غ����� ��!
 * ������ ������ ���� ������ ��������� ����ؼ��� �˰��ֱ� ������
 * ���� Ǯ�̿��� ��������Ʈ�� ��ȯ�� ��Ű�� ����ҵ�?
 * 
 * ���� Ǯ�� �� �� ���� 2020.02.09 19:33
 * ----------------------------
 * ��������Ʈ�� �ٲ���� �ð��ʰ��� ���� ��������Ʈ ����� ����� �ٲ���ȴ�.
 * �ʱ⿡�� ���� ��ΰ� �ִٸ� �ش� ����� ����ġ ���� �����Ű�� ����� ����ߴ���
 * �Է��� �޴µ����� ��û�� �ð��� �ɸ��� �� �ߴ�.
 * �׷��� �׳� �Է� �˴� �־��ְ� �����ϴ� ����� ���ߴ�.
 * + ������� �� �� BufferedReader, BufferdWriter�� ���������.
 * �������� ���� �ڵ�� ����
 */
import java.util.*;
import java.io.*;
public class baekjoon_1753 {
	static int INF = 1 << 30;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int v = Integer.parseInt(input[0]) + 1, e = Integer.parseInt(input[1]), k = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<int[]>> list = new ArrayList<ArrayList<int[]>>();
		for(int i = 0; i < v; i++) list.add(new ArrayList<int[]>());
		int[] rst = new int[v], vst = new int[v];
		for(int i = 1; i < v; i++){
			if(i == k) continue;
			rst[i] = INF;
		}
		vst[k] = 1;
		
		for(int i = 0; i < e; i++){
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);
			list.get(a).add(new int[] {b, c});
		}
		
		for(int i = 0; i < v; i++) list.get(i).sort((a, b) -> {return a[1] - b[1];});
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return a[1] - b[1];});
		ArrayList<int[]> tmpList = list.get(k);
		int cnt = 1, size = tmpList.size();
		
		for(int i = 0; i < size; i++){
			// ���������� ����� ��θ� �켱���� ť�� �־��ش�.
			pq.add(tmpList.get(i));
		}
		while(cnt < v - 1 && !pq.isEmpty()){
			// ���� �켱���� ť�� �ִ� ���� �� ���� ���Ҹ� ������.
			int[] poll = pq.poll();
			int a = poll[0], b = poll[1];
			// �ش� ����� ���������� �湮���� �ʾҴ� ���̶�� ������� �����Ѵ�.
			if(vst[a] == 0) {
				vst[a] = 1;
				rst[a] = b;
				// �湮���� �ʾҴ� ���̶�� �� ���� ����� �湮���� ���� ������ ���ϴ� ��θ� �켱���� ť�� �־��ش�.
				tmpList = list.get(a);
				size = tmpList.size();
				for(int i = 0; i < size; i++) {
					int[] tmpArr = tmpList.get(i);
					if(vst[tmpArr[0]] == 0) {
						tmpArr[1] += b;
						pq.add(tmpArr);
					}
				}
			}
		}
		for(int i = 1; i < v; i++){
			bw.write(rst[i] == INF ? "INF" : (rst[i] + ""));
			bw.write("\n");
		}
		bw.flush();
	}
}
