package baekjoon_queue;
import java.util.*;
// https://www.acmicpc.net/problem/11866 조세퍼스 문제 0
// 문제 이해를 위한 설명 (문제의 예제)
// 1 2 3 4 5 6 7 ->을 큐에 넣어두고 k 번째의 수를 계속 빼면 됨
// 1 2 3 4 5 6 7 -> 에서 3번째는 3이므로 3을 출력하면서 빼냄
// 1 2 4 5 6 7   -> 3을 빼낸 모습
// 4 5 6 7 1 2   -> 3까지 진행했었으므로 이제 4부터 시작
// 4 5 6 7 1 2   -> 현재 상태에서 3번째는 6
// 4 5 7 1 2     -> 위와 동일하게 진행
// 7 1 2 4 5     -> 이런식으로 나아가면 예제 출력이 됨.
//------------------------
// 큐의 진행 모습
// 1 2 3 4 5 6 7
// 2 3 4 5 6 7 1
// 3 4 5 6 7 1 2
// -->> 3번 돌았으므로 큐의 맨 앞 자료를 꺼냄.(출력도 같이)
// 4 5 6 7 1 2
// 5 6 7 1 2 4
// 6 7 1 2 4 5
// -->> 3번 돌았으므로 큐의 맨 앞 자료를 꺼냄.(출력도 같이)
// 위 방법을 큐가 빌때까지 반복
public class baekjoon_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i < N + 1; i++) que.add(i);
		System.out.print("<");
		while (!que.isEmpty()) {
			for (int i = 0; i < K; i++) {
				if (i == K - 1) System.out.print(que.poll());
				else que.add(que.poll());
			}
			
			if (que.isEmpty()) System.out.print(">");
			else System.out.print(", ");
		}

	}
}
