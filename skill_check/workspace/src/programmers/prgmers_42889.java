package programmers;
import java.util.*;
public class prgmers_42889 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        int[] dodal = new int [N];
        int[] fail  = new int [N];
        for(int i : stages) {
        	if(i == N+1) {
        		for(int j=0; j<N; j++) dodal[j]++;
        		continue;
        	}
        	for(int j=0; j<i; j++) dodal[j]++;
        	fail[i-1]++;
        }
        double[][] failure = new double [N][2];
        for(int i=0; i<N; i++) {
        	failure[i][0] = i+1;
        	if(dodal[i] == 0 && fail[i] == 0) failure[i][1] = 0;
        	else failure[i][1] = fail[i] / (double)dodal[i];
        }
        Arrays.sort(failure, (arr1,arr2)->{
        	if(arr1[1] == arr2[1]) return 0;
        	return (arr2[1] - arr1[1]) < 0 ? -1 : 1;
        	});
        for(int i=0; i<N; i++) answer[i] = (int)failure[i][0];
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
