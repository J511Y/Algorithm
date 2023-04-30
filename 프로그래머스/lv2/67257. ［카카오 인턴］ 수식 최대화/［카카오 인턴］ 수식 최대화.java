import java.util.*;

class Solution {
    String[] ex;
    
    public long solution(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "[-+*/]", true);
        ex = new String[st.countTokens()];
        for(int i = 0; i < ex.length; i++) ex[i] = st.nextToken();
        
        long max = 0;
        String[] operations = { "+-*", "+*-", "-+*", "-*+", "*-+", "*+-" };
        for(String oper : operations) max = Math.max(max, calc(oper));
        return max;
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
}