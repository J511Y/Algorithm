package workspace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
입출력 예
a	b	return
3	5	12
3	3	3
5	3	12
 */
class Solution2 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant,(String s1,String s2)->{return s1.compareTo(s2);});
        Arrays.sort(completion,(String s1,String s2)->{return s1.compareTo(s2);});
        for(int i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        return participant[participant.length-1];
    }
}
public class skill_check2 {

	public static void main(String[] args) {
		
		String [] participant = {"dwf","sdf","asd","win"};
		String [] completion = {"win","sdf","dwf"};
		System.out.println(new Solution2().solution(participant, completion));

	}

}
