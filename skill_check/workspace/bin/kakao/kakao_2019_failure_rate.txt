package kakao;
import java.util.*;
public class kakao_2019_failure_rate {
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        int[] dodal = new int [N];
        int[] fail  = new int [N];
        for(int i : stages) {
        	// N+1이면 스테이지 끝까지 도달 AND 실패 없음
        	if(i == N+1) {
        		for(int j=0; j<N; j++) dodal[j]++;
        		continue;
        	}
        	for(int j=0; j<i; j++) dodal[j]++;
        	fail[i-1]++;
        }
        // 인덱스와 실패율을 저장할 이차원배열
        double[][] failure = new double [N][2];
        for(int i=0; i<N; i++) {
        	failure[i][0] = i+1;
        	// 도달이 0이면 실패율도 0
        	if(dodal[i] == 0) failure[i][1] = 0;
        	else failure[i][1] = fail[i] / (double)dodal[i];
        }
        // 정렬
        Arrays.sort(failure, (arr1,arr2)->{
        	if(arr1[1] == arr2[1]) return 0;
        	return (arr2[1] - arr1[1]) < 0 ? -1 : 1;
        });
        // 출력해보기
        for(double[] arr : failure) {
        	System.out.println(arr[0]+"   "+arr[1]);
        }
        // 정답 int형 배열에 인덱스만 넣어주기
        for(int i=0; i<N; i++) answer[i] = (int)failure[i][0];
        return answer;
    }
	public static void main(String[] args) {
		for(int i : solution(1, new int [] {1,2})) 
			System.out.println(i);
	}

}
