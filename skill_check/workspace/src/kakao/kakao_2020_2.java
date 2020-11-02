package kakao;
import java.util.*;
public class kakao_2020_2 {
	int[] count = new int[11]; // max
    Map<String, Integer> map = new HashMap<>();
    void MakeCourse(String s, int idx, String rst){
        int len = rst.length();
        if(len > 1){
            int cnt = map.getOrDefault(rst, 0);
            count[len] = Math.max(count[len], cnt + 1);
            map.put(rst, cnt + 1);
        }
        for(int i = idx + 1; i < s.length(); i++) MakeCourse(s, i, rst + s.charAt(i));
    }
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(String s : orders) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            MakeCourse(new StringBuffer().append(arr).toString(), -1, "");
        }
        for(String s : map.keySet()){
            int len = s.length();
            for(int i : course){
                if(len == i){
                    if(count[len] == map.get(s) && map.get(s) > 1) list.add(s);
                }
            }
        }
        list.sort(null);
        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) answer[i] = list.get(i);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
