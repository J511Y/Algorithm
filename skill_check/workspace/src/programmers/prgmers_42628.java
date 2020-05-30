package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42628
// 이중우선순위큐
import java.util.*;
public class prgmers_42628 {
	static public int[] solution(String[] operations) {
		PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        for(String s : operations) {
        	String[] arr = s.split(" ");
            int value = Integer.parseInt(arr[1]);
        	if(arr[0].equals("I")) {
        		minpq.add(value);
        		maxpq.add(value);
        	}else {
        		(value == 1 ? minpq : maxpq).remove(value == 1 ? maxpq.poll() : minpq.poll());
        	}
        }
        if(maxpq.isEmpty()) return new int[] {0, 0};
        else return new int[] {maxpq.poll(), minpq.poll()};
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"I 16","D 1"})));
		System.out.println(Arrays.toString(solution(new String[] {"I 7","I 5","I -5","D -1"})));
	}

}
