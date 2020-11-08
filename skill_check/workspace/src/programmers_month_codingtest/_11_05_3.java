package programmers_month_codingtest;

import java.util.*;
public class _11_05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] a) {
        int answer = -1, len = a.length, maxCnt = 0, max = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            int x = a[i];
            List<Integer> list = map.getOrDefault(x, new ArrayList<>());
            list.add(i);
            maxCnt = Math.max(maxCnt, list.size());
            map.put(x, list);
        }
        if(maxCnt < 2) return 0;
        
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((x, y)->{return y.size() - x.size();});
        for(int i : map.keySet()) pq.add(map.get(i));
        
        while(!pq.isEmpty()){
            List<Integer> list = pq.poll();
            int size = list.size();
            if(size <= max) break;
            int cnt = 0, left = 0;
            for(int i = 0; i < size; i++){
                int next = list.get(i);
                if(left > next) continue;
                if(left == next && next != len - 1) {
                    if(i < size - 1 && next + 1 == list.get(i + 1)) {
                        left++;
                        continue;
                    }
                    left += 2;
                    cnt++;
                }else if(left < next) {
                    left = next + 1;
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        
        return max * 2;
    }
}
