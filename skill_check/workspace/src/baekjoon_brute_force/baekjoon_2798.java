package baekjoon_brute_force;
import java.util.*;
// 일반적인 스캐너를 사용해서 푼 풀이입니다.
// 스터디 시간에 했던 방식과 동일하지만 입출력 스트림이 다를 뿐입니다.
public class baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int blackjack = sc.nextInt();
        int [] arr = new int [r];
        for(int i=0; i<r; i++) arr[i] = sc.nextInt();
        int max = 0;
        for(int i = 0; i < r-2; i++) {
        	for(int j = i+1; j < r-1; j++) {
        		for(int k = j+1; k < r; k++) {
        			int sum = arr[i] + arr[j] + arr[k];
        			// 기존 result보단 크지만 blackjack 보다는 작은 수.
        			if(sum <= blackjack)max = Math.max(sum, max);
        		}
        	}
        }
        System.out.println(max);
    }
}
