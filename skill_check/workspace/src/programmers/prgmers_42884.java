package programmers;
import java.util.*;
public class prgmers_42884 {
	public static int solution(int[][] routes) {
        int answer = 0, last = -99999;
        ArrayList<int[]> list = new ArrayList<int[]>();
        for(int[] arr : routes) list.add(arr);
        list.sort(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int rtn = o1[1] - o2[1];
				return rtn == 0 ? o1[0] - o2[0] : rtn;
			}
		});
        for(int i = 0; i < list.size(); i++) {
        	int[] arr = list.get(i);
        	if(arr[0] <= last && last <= arr[1]) continue;
        	else {
        		answer++;
        		last = arr[1];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [][]{{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}}));

	}
}
