package programmers;
import java.util.*;
public class prgmers_42746 {
	public static String solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(numbers).forEach(i->list.add(i));
        list.sort((i1, i2)->{
        	StringBuffer sb1 = new StringBuffer();
        	StringBuffer sb2 = new StringBuffer();
        	sb1.append(i1); sb2.append(i2);
        	if(sb1.length() == sb2.length()) return i2 - i1;
        	while(sb1.length() != sb2.length()) {
        		if(sb1.length() < sb2.length()) sb1.append(i1);
        		else sb2.append(i2);
        	}
        	return sb2.compareTo(sb1);
        });
        StringBuffer sb = new StringBuffer();
        for(int i : list) sb.append(i);
        if(sb.toString().equals("0".repeat(sb.length()))) return "0";
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [] {6, 10, 2}));		// 6210
		System.out.println(solution(new int [] {3, 30, 34, 5, 9}));	// 9534330
	}
}
