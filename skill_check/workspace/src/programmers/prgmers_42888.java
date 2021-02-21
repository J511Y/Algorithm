package programmers;
import java.util.*;
public class prgmers_42888 {
	public static String[] solution(String[] record) {
        
        List<String> chatlist = new ArrayList<String>();
        Map<String,String> nickname = new HashMap<String,String>();
        for(String s : record) {
        	String [] arr = s.split(" ");
        	if(arr.length>2)nickname.put(arr[1], arr[2]);
        	if(s.startsWith("Enter"))chatlist.add(arr[1]+" 님이 들어왔습니다.");
        	if(s.startsWith("Leave"))chatlist.add(arr[1]+" 님이 나갔습니다.");
        }
        List<String> result = new ArrayList<>();
        for(int i=0; i<chatlist.size();i++) {
        	String s = chatlist.get(i); 
        	result.add(s.replace(s.split(" ")[0]+" ",nickname.get(s.split(" ")[0])));
        }
        
        String[] answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
