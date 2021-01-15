package baekjoon_brute_force;
import java.io.*;
import java.util.*;
public class baekjoon_1018 {
	static String [] pattern = new String[] {"BWBWBWBW" , "WBWBWBWB"}; //�����Ƽ� ������ ����
	
	static int compare(String s1, int line) {
		int cnt = 0;
		for(int i=0; i<8; i++) {
			// �� ���� chess�ǰ� ��� ������ �� �ִ��� ��
			if(s1.charAt(i) == pattern[line].charAt(i)) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���پ� �о���̴� br.readLine()
		// Arrays.stream�� ����� ��Ʈ��ȭ ��Ű��
		// mapToInt�� �� ���ҵ��� ���ٸ� �̿��� ����ȭ
		// toArray()�� �ٽ� �迭ȭ.
		// �������� ��Խ����� �׳� �� ó�� �Է°� �迭�� �ٲٴ� ����....python���� ��Ÿ����
		int [] inputArr = Arrays.stream(br.readLine().split(" "))
								.mapToInt(s->Integer.parseInt(s))
								.toArray();
		// String �迭 ����� �ʱ�ȭ ����
		String[] board = new String[inputArr[0]];
		for(int i=0; i<inputArr[0]; i++) 
			board[i] = br.readLine();
		// min�� �ƹ��� Ŀ���� 32
		int min=33;
		
		// 8 * 8 �� �ڸ� �� �ִ� ��� ����� ���� ã�ƺ�.
		// i�� �ִ밪�� n-8, j�� �ִ밪�� m-8
		for(int i=0; i<inputArr[0]-7; i++) {
			for(int j=0; j<inputArr[1]-7; j++) {
				// board[i][j] ���� 8 * 8 ĭ�� �κ� board�� chess�ǰ� �󸶳� �ٸ��� Ȯ������ sum ����
				int sum=0;
				for(int k=0; k<8; k++) {
					sum += compare(board[i+k].substring(j, j+8), k%2);
				}
				// sum�� 32���� ũ�ٸ� ������ "BWBWBWBW" , "WBWBWBWB" �� �ƴ϶�
				//					   "WBWBWBWB" , "BWBWBWBW" �� ä��� �� �� ���� 
				sum = sum > 32 ? 64 - sum : sum;
				min = Math.min(min, sum);
			}
		}
		System.out.println(min);
	}
}
