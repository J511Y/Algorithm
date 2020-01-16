package workspace;
import java.util.*;
class Main {
	public static int[] solution(int brown, int red) {
        int sum = brown + red;
        for(int i=3; i<sum/2; i++) {
        	if(sum % i == 0) {
        		int min = i;
        		int max = sum / i;
        		if((min-2) * (max-2) == red) return new int [] {max, min};
        	}
        }
        return null;
    }
	public static void main(String [] args){
		for(int i : solution(10, 2))System.out.print(i+" ");
		System.out.println();
		for(int i : solution(8, 1))System.out.print(i+" ");
		System.out.println();
		for(int i : solution(24, 24))System.out.print(i+" ");
		System.out.println();
	}
}
