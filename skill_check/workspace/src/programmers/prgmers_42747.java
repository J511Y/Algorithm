package programmers;
import java.util.*;
public class prgmers_42747 {
	public static void main(String[] args) {
		Solution s = new Solution(new int[] {0, 0, 0, 2, 4, 3, 7, 7, 8, 9, 2, 48, 6, 8});
		
		s.BruteForce();
		
		s.BruteForce_QuickFind();
		
		s.Sort();
	}
}

class Solution{
	int[] citations, sort_citations;
	int len, answer, oper_cnt;
	
	// ������
	Solution(int[] citations){
		this.citations = citations;
		this.sort_citations = citations;
		this.len = citations.length;
		
		Arrays.sort(sort_citations);
	}
	
	// ����� �ʱ�ȭ
	// type : 0 = ������, 1 = ����
	void init(int type) {
		this.answer = 0;
		this.oper_cnt = 0;
		
		// ���� ��� Ž�� �� ���� Ƚ���� n log n ������ (���̰� n�� �迭 ���� �� n log n�� �ɸ�)
		// **������ ������ �ּ��� ��� n log n, �־��� ��� n���������� ���� �Ѿ��
		if(type == 1) this.oper_cnt += (int)(len * Math.log(len));
	}
	
	// ��� �� ���� Ƚ�� ���
	void disp() {
		System.out.println("��� : " + answer + ", ���� Ƚ�� : " + oper_cnt);
	}
	
	/*
	 * BruteForce()
	 * ------------
	 * ������ ��� h-index ���� Ž���Ͽ� �ִ� h-index�� �����ϴ� �Լ�
	 * �������� �־��� �迭�� ũ�Ⱑ �۱� ������ ������ ���
	 */
	int BruteForce() {
		// �ʱ�ȭ
		init(0);
		
		int max_h = 0;
		// h-index�� ���� = 0 ~ len
		for(int h = 0; h <= len; h++) {
			// ���� Ƚ�� ����
			oper_cnt++;
			
			int big = 0;
			for(int i : citations) {
				// ���� Ƚ�� ����
				oper_cnt++;
				
				// �迭�� ���Ұ� ���Ƿ� ���� h���� ���ų� ũ�ٸ� big ����
				if(h <= i) big++;
			}
			
			// �������� �־��� ���� Ȯ���Ͽ� max_h�� ����
			if(big >= h) max_h = Math.max(max_h, h);
		}
		
		this.answer = max_h;
		disp();
		return max_h;
	}
	
	/*
	 * BruteForce_QuickFind()
	 * ------------
	 * ������ BruteForce
	 * ������ ��� h-index ������ ã�� �� ������ big,small ī��Ʈ �ϴ� ����� �޶���
	 */
	int BruteForce_QuickFind() {
		// �ʱ�ȭ (����)
		init(1);
		
		int max_h = 0;
		// h-index�� ���� = 0 ~ len
		for(int h = 0; h <= len; h++) {
			// ���� Ƚ�� ����
			oper_cnt++;
			
			int big = 0;
			for(int i = 0; i < len; i++) {
				oper_cnt++;
				
				// h���� ���ų� Ŀ���� ���Ҹ� �߰��ϸ� big,small �����ϰ� ����
				if(sort_citations[i] >= h) {
					
					// ���ĵǾ� �����Ƿ� i��° ���ķδ� ���ų� ŭ�� �����
					big = len - i;
					break;
				}
			}
			
			// �������� �־��� ���� Ȯ���Ͽ� max_h�� ����
			if(big >= h) max_h = Math.max(max_h, h);
		}
		
		this.answer = max_h;
		disp();
		return max_h;
	}
	
	/*
	 * Sort()
	 * ------------
	 * ���� �� �迭���� ���� ���θ��� �Ǵ��ϴ� ���
	 */
	int Sort() {
		// �ʱ�ȭ (����)
		init(1);
		
		int max_h = 0;
		// h-index�� ���� = 0 ~ len
		for(int i = 0, k = 0; i < len; i++) {
			// ���� Ƚ�� ����
			oper_cnt++;
			
			// ���ĵ� �迭���� i��° �ε����� ��ġ�� ������ ���� ���� ���
			// x = �迭������ i��° ����
			// k = len - i (i���� ������ h-index�� �ִ밪)
			// 
			// arr = [0, 0, 2, 3, 4] �� ���
			// h = 1�̶� �������� �� x = 0 (arr[i]), k = 4 (5 - i)
			// �ִ� h-index�� 4�� ���� �� ����. (�� ��ġ ���ķ� ��� 4 �̻��� ���)
			// ���� k �� x ���� ���ų� ���� ��� �ִ� h-index���� k
			
			k = len - i;
			if (k <= sort_citations[i]) {
                max_h = k;
                break;
            }
		}
		
		this.answer = max_h;
		disp();
		return max_h;
	}
}
