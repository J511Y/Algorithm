package baekjoon_스택;
// https://www.acmicpc.net/problem/10799
// 쇠막대기
import java.util.*;
public class baekjoon_10799 {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
        char[] arr = s.toCharArray();
        int len = s.length(), cnt = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<len; i++) {
        	if(arr[i] == '(') {
        		if(arr[i+1] == ')') {
        			cnt += stack.size();
        			i++;
        		}else stack.push('(');
        	}else {
        		cnt++;
        		stack.pop();
        	}
        }
        System.out.println(cnt);
	}
}
