package baekjoon_queue;
import java.util.*;
public class programmers_42856 {
	public static int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();
		int idx = 0;
		int len = speeds.length;
		while(idx < len) {
			for(int i=idx; i<len; i++) progresses[i] += speeds[i];
			int cnt = 0;
			while(idx < len && progresses[idx] > 99) {
				idx++; cnt++;
			}
			if(cnt > 0) list.add(cnt);
		}
		int[] result = new int [list.size()];
		for(int i=0; i<list.size(); i++) result[i] = list.get(i);
		return result;
	}
	public static void main(String[] args) {
		for(int i : solution(new int [] {93,30,55}, new int [] {1, 30, 5})) System.out.println(i);

	}

}
