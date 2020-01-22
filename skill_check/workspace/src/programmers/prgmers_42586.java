package programmers_stack_queue;
import java.util.*;
public class prgmers_42586 {
	public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
		int idx = 0; // 인덱스 저장 변수
		int len = speeds.length;
		while(idx < len) { // 모든 작업을 배포해야하므로
			for(int i=idx; i<len; i++) progresses[i] += speeds[i]; // 각 작업이 가진 속도만큼 증가시켜줌
			int cnt = 0; // 배포되는 작업의 개수를 저장할 변수
			while(idx < len && progresses[idx] > 99) { // idx가 배열의 범위를 벗어나지 않으면서 100이상일 경우 (99 초과일 경우)
				idx++; cnt++; // idx는 다음 배열의 원소를 가르키도록 변경, cnt 1 증가
			}
			if(cnt > 0) list.add(cnt); // 동적 배열 리스트에 add
		}
		int[] result = new int [list.size()]; // list 사이즈만큼의 배열 선언,초기와
		for(int i=0; i<list.size(); i++) result[i] = list.get(i); // 값 옮기기
		return result;
    }
	public static void main(String[] args) {
		for(int i : solution(new int [] {93,30,55}, new int [] {1,30,5})) System.out.println(i);

	}

}
/*
기능개발
문제 설명
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
입출력 예
progresses	speeds	return
[93,30,55]	[1,30,5]	[2,1]
입출력 예 설명
첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.

따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
*/