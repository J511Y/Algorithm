package workspace;

import java.util.*;

public class skill_check1 {
	public static int solution(int n) {
        int i=0;
        int room=1;
        for(; room < n; i++) {
        	room += 6*i;
        }
        System.out.println(i+","+room);
        return n;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(58));
	}

}
/*
 * 2 1 2 2
 * 1 : 7
 * 2 : 18
 * 3 : 16
 * 4 : 8
 * ÃÑ 49°³
 */