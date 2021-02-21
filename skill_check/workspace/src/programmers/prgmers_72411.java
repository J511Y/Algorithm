package programmers;
import java.util.*;
public class prgmers_72411 {
	int[] cnt = new int[11];
    Map<String, Integer> map = new HashMap<>();
    void makeMenu(String s, int idx, int bit) {
        int bc = Integer.bitCount(bit);
        if(bc >= 2) {
            int val = map.getOrDefault(bitToMenu(bit), 0) + 1;
            cnt[bc] = Math.max(cnt[bc], val);
            map.put(bitToMenu(bit), val);
        }
        for(int i = idx + 1; i < s.length(); i++) {
            makeMenu(s, i, bit | (1 << (s.charAt(i) - 'A')));
        }
    }
    String bitToMenu(int bit) {
        String rtn = "";
        for(int i = 0; i < 26; i++) rtn += (bit & (1 << i)) > 0 ? (char)('A' + i) : "";
        return rtn;
    }
    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        for(String order : orders) makeMenu(order, -1, 0);
        for(int c : course) {
            if(cnt[c] > 1) {
                for(String key : map.keySet()) {
                    if(key.length() == c && map.get(key) == cnt[c]) list.add(key);
                }
            }
        }
        list.sort(null);
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
