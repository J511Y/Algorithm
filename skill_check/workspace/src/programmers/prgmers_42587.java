package programmers_stack_queue;
import java.util.*;
public class prgmers_42587 {
	public static int solution(int[] priorities, int location) {
		// 배열의 max값을 구하는 함수. 빈 배열일 수도 있어서 ObtionalInt를 반환시킨다.
        int max = Arrays.stream(priorities).max().getAsInt();
        int cnt = 0;
        Queue<Integer> q1 = new LinkedList<Integer>(); // 값을 저장하고 있을 큐
        Queue<Integer> q2 = new LinkedList<Integer>(); // 값에 해당하는 인덱스를 저장하고 있을 큐
        
        for(int i : priorities) {
        	// q1.offer(i) == q1.add(i)  둘이 같은 기능을 하는 메서드.
        	q1.offer(i); // q1에는 값을,
        	q2.offer(cnt++); // q2에는 index를 저장해준다.
        }
        
        cnt=0;
        while(!q1.isEmpty()) { // 끝나는 지점을 정확한 값으로 알고 있는 게 아니므로 while문 사용
        	int i1 = q1.poll();
        	int i2 = q2.poll();
        	if(i1 == max) { // max값이 제일 우선순위가 높음.
        		priorities[i2] = -1; // max값에 더 이상 해당되지 않게 하기 위해 -1 저장
        		cnt++; // 카운트 증가
        		if(i2 == location)break; // 방금 추출한 값이 location과 일치한다면 반복문 종료
        		max = Arrays.stream(priorities).max().getAsInt(); // max 값 재 저장
        	}
        	else {
        		q1.offer(i1); // 꺼낸 값이 max가 아니라면 큐의 맨 뒤로
        		q2.offer(i2); // 꺼낸 값이 max가 아니라면 큐의 맨 뒤로
        	}
        }
        return cnt;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [] {2, 1, 3, 2}, 2));
		System.out.println(solution(new int [] {1, 1, 9, 1, 1, 1}, 0));

	}

}
/*
문제 설명
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.

1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.
예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.

내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.

제한사항
현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
입출력 예
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
입출력 예 설명
예제 #1

문제에 나온 예와 같습니다.

예제 #2

6개의 문서(A, B, C, D, E, F)가 인쇄 대기목록에 있고 중요도가 1 1 9 1 1 1 이므로 C D E F A B 순으로 인쇄합니다.
*/