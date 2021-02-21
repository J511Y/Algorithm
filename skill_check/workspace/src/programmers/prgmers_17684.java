package programmers;
import java.util.*;
public class prgmers_17684 {
	public int[] solution(String msg) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int len = msg.length();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++) map.put((char)('A' + i) + "", i + 1);
        int lastIdx = 27;
        for(int i = 0; i < len; i++){
            String str = msg.charAt(i) + "";
            int last = map.get(str), idx = i + 1;
            for(int j = i + 1; j < len; j++){
                last = map.get(str);
                str += msg.charAt(j);
                
                if(map.getOrDefault(str, 0) == 0){
                    map.put(str, lastIdx++);
                    i += str.length() - 2;
                    break;
                } else last = map.get(str);
                
                if(j == len - 1) i = len;
            }
            list.add(last);
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) answer[i] = list.get(i);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
