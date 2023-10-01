import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
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
}