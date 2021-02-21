package programmers;
import java.util.*;
public class prgmers_72412 {
	int count(List<Integer> list, int score) {
        int cnt = 0;
        int l = 0, r = list.size() - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(list.get(mid) < score) l = mid + 1;
            else r = mid - 1;
        }
        return list.size() - r - 1;
    }
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        Map<String, List<Integer>> map = new HashMap<>();
        for(String in : info) {
            String[] split = in.split(" ");
            int score = Integer.parseInt(split[4]);
            String[][] arr = new String[16][4];
            for(int i = 0; i < 16; i++) {
                for(int j = 0; j < 4; j++) {
                    arr[i][3-j] = (i & (1 << j)) > 0 ? "-" : split[3-j];
                }
            }
            for(String[] ar : arr) {
                String comb = ar[0] + ar[1] + ar[2] + ar[3];
                List<Integer> list = map.getOrDefault(comb, new ArrayList<>());
                list.add(score);
                map.put(comb, list);
            }
        }
        for(List<Integer> list : map.values()) list.sort((a, b) -> a - b);
        for(int q = 0; q < query.length; q++) {
            String[] split = query[q].split(" ");
            //0 2 4 6 7
            String comb = split[0] + split[2] + split[4] + split[6];
            int score = Integer.parseInt(split[7]);
            answer[q] = count(map.getOrDefault(comb, new ArrayList<>()), score);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
