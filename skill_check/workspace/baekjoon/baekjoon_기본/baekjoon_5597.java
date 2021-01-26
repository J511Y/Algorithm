package baekjoon_기본;
// https://www.acmicpc.net/problem/5597
// 과제 안내신 분...?
import java.util.*;
public class baekjoon_5597 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int[] students = new int[31];
		for(int i = 0; i < 28; i++) students[sc.nextInt()] = 1;
		for(int i = 1; i < 31; i++) {
			if(students[i] == 0) System.out.println(i);
		}
	}
}
