package workspace;
import java.util.*;
public class skill_level_3_1 {
	static int answer = 0;
	public static void cal(int add, int n) {
//		System.out.println(add);
		if(Math.pow(3, add/2) > n) return;
		if(n==3) {
			if(add==2) answer++;
		}else if(n > 3) {
			if(add>=2 && n%3==0) cal(add-2, n/3);
			cal(add+1, n-1);
		}
	}
	public static int solution(int n) {
		answer = 0;
		cal(0, n);
		return answer;
	}
	public static void main(String[] a) {
		System.out.println(solution(2147483647));
		System.out.println(solution(6));
		System.out.println(solution(485));
		int x = 1;
		for(int i=0; i<5; i++) x = x*3 + 2;
		System.out.println(x);
	}
}

