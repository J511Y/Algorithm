package baekjoon_dijkstra;
// https://www.acmicpc.net/problem/1753
// 최단경로
/*
 * 문제
방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점으로의 최단 경로를 구하는 프로그램을 작성하시오. 
단, 모든 간선의 가중치는 10 이하의 자연수이다.

입력
첫째 줄에 정점의 개수 V와 간선의 개수 E가 주어진다. (1≤V≤20,000, 1≤E≤300,000) 
모든 정점에는 1부터 V까지 번호가 매겨져 있다고 가정한다. 
둘째 줄에는 시작 정점의 번호 K(1≤K≤V)가 주어진다. 
셋째 줄부터 E개의 줄에 걸쳐 각 간선을 나타내는 세 개의 정수 (u, v, w)가 순서대로 주어진다. 
이는 u에서 v로 가는 가중치 w인 간선이 존재한다는 뜻이다. 
u와 v는 서로 다르며 w는 10 이하의 자연수이다. 
서로 다른 두 정점 사이에 여러 개의 간선이 존재할 수도 있음에 유의한다.

출력
첫째 줄부터 V개의 줄에 걸쳐, i번째 줄에 i번 정점으로의 최단 경로의 경로값을 출력한다. 
시작점 자신은 0으로 출력하고, 경로가 존재하지 않는 경우에는 INF를 출력하면 된다.
 */

/*
 * 문제 풀기 전 생각 2020.02.09 19:01
 * ----------------------------
 * 스터디 때 풀었던 문제인데 메모리 초과로 인해 실패했었다.
 * 다익스트라 개념도 잡을 겸 다시 해보려는 중!
 * 어차피 지난번 실패 이유는 인접행렬을 사용해서로 알고있기 때문에
 * 기존 풀이에서 인접리스트로 변환만 시키면 통과할듯?
 * 
 * 문제 풀고 난 후 생각 2020.02.09 19:33
 * ----------------------------
 * 인접리스트로 바꿨더니 시간초과가 나서 인접리스트 만드는 방식을 바꿔버렸다.
 * 초기에는 같은 경로가 있다면 해당 경로의 가중치 값만 변경시키는 방식을 사용했더니
 * 입력을 받는데에만 엄청난 시간이 걸리는 듯 했다.
 * 그래서 그냥 입력 죄다 넣어주고 정렬하는 방식을 택했다.
 * + 입출력을 둘 다 BufferedReader, BufferdWriter로 변경해줬다.
 * 나머지는 기존 코드와 동일
 */
import java.util.*;
import java.io.*;
public class baekjoon_1753 {
	static int INF = 1 << 30;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력받기
		String[] input = br.readLine().split(" ");
		int v = Integer.parseInt(input[0]) + 1, e = Integer.parseInt(input[1]), k = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<int[]>> list = new ArrayList<ArrayList<int[]>>();
		// list 초기화 구문
		for(int i = 0; i < v; i++) list.add(new ArrayList<int[]>());
		// 결과 저장 rst, 방문 저장 vst
		int[] rst = new int[v], vst = new int[v];
		// 결과 저장 rst의 자기 자신을 제외한 나머지는 INF로 초기화
		for(int i = 1; i < v; i++){
			if(i == k) continue;
			rst[i] = INF;
		}
		// 본인은 방문했다고 표시.(재방문 안하도록)
		vst[k] = 1;
		
		// 인접리스트 생성
		for(int i = 0; i < e; i++){
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);
			list.get(a).add(new int[] {b, c});
		}
		
		// 인접리스트 정렬
		for(int i = 0; i < v; i++) list.get(i).sort((a, b) -> {return a[1] - b[1];});
		
		// 우선순위 큐 생성, 재계산 안하도록 tmpList, cnt, size 선언 및 초기화
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return a[1] - b[1];});
		ArrayList<int[]> tmpList = list.get(k);
		int cnt = 1, size = tmpList.size();
		
		for(int i = 0; i < size; i++){
			// 시작지점과 연결된 경로를 우선순위 큐에 넣어준다.
			pq.add(tmpList.get(i));
		}
		while(cnt < v - 1 && !pq.isEmpty()){
			// 현재 우선순위 큐에 있는 가장 맨 앞의 원소를 꺼낸다.
			int[] poll = pq.poll();
			int a = poll[0], b = poll[1];
			// 해당 경로의 도착지점이 방문하지 않았던 곳이라면 결과값을 저장한다.
			if(vst[a] == 0) {
				vst[a] = 1;
				rst[a] = b;
				// 방문하지 않았던 곳이라면 그 점과 연결된 방문하지 않은 곳으로 향하는 경로를 우선순위 큐에 넣어준다.
				tmpList = list.get(a);
				size = tmpList.size();
				for(int i = 0; i < size; i++) {
					int[] tmpArr = tmpList.get(i);
					if(vst[tmpArr[0]] == 0) {
						// 해당 정점을 방문하기까지의 가중치를 더해준다.
						tmpArr[1] += b;
						pq.add(tmpArr);
					}
				}
			}
		}
		// 출력
		for(int i = 1; i < v; i++){
			bw.write(rst[i] == INF ? "INF" : (rst[i] + ""));
			bw.write("\n");
		}
		bw.flush();
	}
}
