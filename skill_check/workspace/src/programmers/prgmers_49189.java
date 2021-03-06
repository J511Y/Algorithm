package programmers;
import java.util.*;
public class prgmers_49189 {
	public static int solution(int n, int[][] edge) {
        int answer = 0, last = -1;
        ArrayList<Integer>[] list = new ArrayList[n+1];
        int[] vst = new int [n+1];
        for(int i = 0; i < n + 1; i++) list[i] = new ArrayList<Integer>();
        for(int[] arr : edge) {
        	list[arr[0]].add(arr[1]);
        	list[arr[1]].add(arr[0]);
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int [] {1, 0}); vst[1] = 1;
        while(!q.isEmpty()) {
        	int[] arr = q.poll();
        	if(last != arr[1]) {
        		last = arr[1];
        		answer = 1;
        	}else {
        		answer++;
        	}
        	
        	for(int i : list[arr[0]]) {
        		if(vst[i] == 0) {
        			vst[i] = 1;
        			q.add(new int [] {i, arr[1] + 1});
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr = new int [][] {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		System.out.println(solution(6, arr));
	}

}
