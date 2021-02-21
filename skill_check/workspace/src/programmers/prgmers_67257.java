package programmers;
import java.util.*;
public class prgmers_67257 {
	String[] ex;
    long max = 0;
    
    public long solution(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "[-+*/]", true);
        ex = new String[st.countTokens()];
        for(int i = 0; i < ex.length; i++) ex[i] = st.nextToken();
        
        func(new int[]{0, 0, 0}, 1, "");
        return max;
    }
    
    void func(int[] calc, int next, String str){
        if(next == 4){
            max = Math.max(max, calc(str));
            return;
        }
        for(int i = 0; i < 3; i++){
            if(calc[i] == 0){
                calc[i] = next;
                String tmp = str;
                switch(i){
                    case 0 : tmp += "+"; break;
                    case 1 : tmp += "-"; break;
                    case 2 : tmp += "*"; break;
                }
                func(calc, next + 1, tmp);
                calc[i] = 0;
            }
        }
    }
    
    long calc(String str){
        String[] arr = str.split("");
        Deque<String> dq = new LinkedList<>();
        for(String s : ex) dq.addLast(s);
        for(int i = 0; i < 3; i++){
            Deque<String> tmp = new LinkedList<>();
            while(!dq.isEmpty()){
                String poll = dq.pollFirst();
                if(poll.equals(arr[i])){
                    String a = tmp.pollLast(), b = dq.pollFirst();
                    long rst = 0;
                    switch(arr[i]){
                        case "+" : rst = Long.parseLong(a) + Long.parseLong(b); break;
                        case "*" : rst = Long.parseLong(a) * Long.parseLong(b); break;
                        case "-" : rst = Long.parseLong(a) - Long.parseLong(b); break;
                    }
                    tmp.addLast(rst + "");
                } else{
                    tmp.addLast(poll);
                }
            }
            while(!tmp.isEmpty()) dq.addLast(tmp.pollFirst());
        }
        return Math.abs(Long.parseLong(dq.poll()));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
