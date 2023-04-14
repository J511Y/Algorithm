import java.io.*;
import java.util.*;
class Main{
	static String [] pattern = new String[] {"BWBWBWBW" , "WBWBWBWB"};
	
	static int compare(String s1, int line) {
		int cnt = 0;
		for(int i=0; i<8; i++) {
			if(s1.charAt(i) == pattern[line].charAt(i)) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] inputArr = Arrays.stream(br.readLine().split(" "))
								.mapToInt(s->Integer.valueOf(s))
								.toArray();
		StringBuffer [] board = new StringBuffer [inputArr[0]];
		for(int i=0; i<inputArr[0]; i++) 
			board[i] = new StringBuffer(br.readLine());
		int min=33;
		for(int i=0; i<inputArr[0]-7; i++) {
			for(int j=0; j<inputArr[1]-7; j++) {
				int sum=0;
				for(int k=0; k<8; k++) {
					sum += compare(board[i+k].substring(j, j+8), k%2);
				}
				sum = sum > 32 ? 64 - sum : sum;
				min = Math.min(min, sum);
			}
		}
		System.out.println(min);
	}
}