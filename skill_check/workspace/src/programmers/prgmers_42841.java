package programmers;
import java.util.*;
public class prgmers_42841 {
	public static int solution(int[][] baseball) {
        int answer = 0;
        for(int a=1; a<10; a++) {
        	for(int b=1; b<10; b++) {
        		if(a==b) continue;
        		for(int c=1; c<10; c++) {
        			if(a==c || b==c) continue;
        			boolean chk = true;
                	String s1 = ""+ a + b + c;
                	for(int[] arr : baseball) {
                		String s2 = arr[0] + "";
                		int strike = 0, ball = 0;
                		for(int j = 0; j < 3; j++) {
                			int con = s2.indexOf(s1.charAt(j)+"");
                			if(con == j) strike++;
                			else if (con != -1) ball++;
                		}
                		if(strike != arr[1]) chk = false;
                		if(ball != arr[2]) chk = false;
                	}
                	if(chk) answer++;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int [][] {
			{123, 1, 1},
			{356, 1, 0},
			{327, 2, 0},
			{489, 0, 1}
		}));

	}
}
