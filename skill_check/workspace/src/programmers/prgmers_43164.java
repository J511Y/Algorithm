package programmers;
import java.util.*;
class Ticket{
	String start;
	String end;
	int idx;
}
public class prgmers_43164 {
	static String[] rst;
	static boolean[] vst;
	static Map<String, List<Ticket>> map;
	
	static void dp(String start, int index) {
		rst[index] = start;
		if(index == vst.length) return;
		List<Ticket> list = map.get(start);
		if(list == null) return;
		for(Ticket t : list) {
			if(!vst[t.idx]) {
				vst[t.idx] = true;
				dp(t.end, index + 1);
				if(rst[vst.length] != null) return;
				vst[t.idx] = false;
			}
		}
	}
	
	public static String[] solution(String[][] tickets) {
		vst = new boolean [tickets.length];
		rst = new String [tickets.length + 1];
        map = new HashMap<>();
        for(int i=0; i<tickets.length; i++) {
        	String s = tickets[i][0]; String e = tickets[i][1];
        	Ticket t = new Ticket();
        	t.start = s; t.end = e; t.idx = i;
        	if (map.containsKey(s)) {
        		map.get(s).add(t);
        	}else {
        		List<Ticket> list = new ArrayList<>();
        		list.add(t);
        		map.put(s, list);
        	}
        }
        
        for(String s : map.keySet()) map.get(s).sort((t1, t2) -> {return t1.end.compareTo(t2.end);});
        dp("ICN", 0);
        return rst;
    }
	public static void main(String[] args) {
//		for(String s : solution(new String[][] {{"ICN","SFO"}, {"ICN","ATL"},{"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}})) System.out.println(s);
		for(String s : solution(new String[][] {{"ICN","COO"}, {"ICN","BOO"},{"COO", "ICN"}, {"BOO", "DOO"}})) System.out.println(s);

	}

}
