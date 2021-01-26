package baekjoon_다익스트라;
// https://www.acmicpc.net/problem/1916
// 최소비용 구하기
/*
 * 문제
N의 도시가 있다. 
그리고 한 도시에서 출발하여 다른 도시에 도착하는 M개의 버스가 있다. 
우리는 A번째 도시에서 B번째 도시까지 가는데 드는 버스 비용을 최소화 시키려고 한다. 
그러면 A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라. 
도시의 번호는 1부터 N까지이다.

입력
첫째 줄에 도시의 개수 N(1 ≤ N ≤ 1,000)이 주어지고 둘째 줄에는 버스의 개수 M(1 ≤ M ≤ 100,000)이 주어진다. 
그리고 셋째 줄부터 M+2줄까지 다음과 같은 버스의 정보가 주어진다. 
먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 
그리고 그 다음에는 도착지의 도시 번호가 주어지고 또 그 버스 비용이 주어진다. 
버스 비용은 0보다 크거나 같고, 100,000보다 작은 정수이다.

그리고 M+3째 줄에는 우리가 구하고자 하는 구간 출발점의 도시번호와 도착점의 도시번호가 주어진다. 
출발점에서 도착점을 갈 수 있는 경우만 입력으로 주어진다.
 */

/*
 * 문제 풀기 전 생각 2020.02.09 22:59
 * -----------------------------
 * 기존에 풀었던 대로 진행하면 될 것 같다.
 * 코드가져와야징
 * 
 * 문제 풀면서 든 생각 2020.02.09 23:37
 * -----------------------------
 * 아니ㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣ
 * 왜 안되는데?
 * 왜지
 * 전혀 모르겠는데
 * 뭐가문제지
 * 테스트케이스 다 잘 나오는데
 * 아 개빡치네 진짜
 */
import java.util.*;
import java.io.*;
public class baekjoon_1916 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MAX_VALUE;
		int n = Integer.parseInt(br.readLine()) + 1, m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 1; i < n; i++) Arrays.fill(arr[i], max);
		int[] rst = new int[n], vst = new int[n];
		StringTokenizer st;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a][b] = Math.min(arr[a][b], c);
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), cnt = 1;
		vst[s] = 1;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return a[1] - b[1];}) ;
		for(int i = 1; i < n; i++) {
			if(arr[s][i] != max) {
				pq.add(new int[] {i, arr[s][i]});
			}
		}
		while(cnt < n - 1 && !pq.isEmpty()) {
			int[] tmp = pq.poll();
			int a = tmp[0], b = tmp[1];
			if(vst[a] == 0) {
				cnt++;
				vst[a] = 1;
				rst[a] = b;
				for(int i = 1; i < n; i++) {
					if(vst[i] == 0 && arr[a][i] != max) {
						b += arr[a][i];
						pq.add(new int[] {i, b});
					}
				}
			}
		}
		System.out.println(rst[e]);
	}
}
