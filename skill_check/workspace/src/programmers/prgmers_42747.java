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
	
	// 생성자
	Solution(int[] citations){
		this.citations = citations;
		this.sort_citations = citations;
		this.len = citations.length;
		
		Arrays.sort(sort_citations);
	}
	
	// 결과값 초기화
	// type : 0 = 비정렬, 1 = 정렬
	void init(int type) {
		this.answer = 0;
		this.oper_cnt = 0;
		
		// 정렬 기반 탐색 시 연산 횟수에 n log n 더해줌 (길이가 n인 배열 정렬 시 n log n이 걸림)
		// **엄밀히 따지면 최선일 경우 n log n, 최악일 경우 n제곱이지만 대충 넘어가자
		if(type == 1) this.oper_cnt += (int)(len * Math.log(len));
	}
	
	// 결과 및 연산 횟수 출력
	void disp() {
		System.out.println("결과 : " + answer + ", 연산 횟수 : " + oper_cnt);
	}
	
	/*
	 * BruteForce()
	 * ------------
	 * 가능한 모든 h-index 값을 탐색하여 최대 h-index를 리턴하는 함수
	 * 문제에서 주어진 배열의 크기가 작기 때문에 가능한 방법
	 */
	int BruteForce() {
		// 초기화
		init(0);
		
		int max_h = 0;
		// h-index의 범위 = 0 ~ len
		for(int h = 0; h <= len; h++) {
			// 연산 횟수 증가
			oper_cnt++;
			
			int big = 0;
			for(int i : citations) {
				// 연산 횟수 증가
				oper_cnt++;
				
				// 배열의 원소가 임의로 정한 h보다 같거나 크다면 big 증가
				if(h <= i) big++;
			}
			
			// 문제에서 주어진 조건 확인하여 max_h값 갱신
			if(big >= h) max_h = Math.max(max_h, h);
		}
		
		this.answer = max_h;
		disp();
		return max_h;
	}
	
	/*
	 * BruteForce_QuickFind()
	 * ------------
	 * 발전된 BruteForce
	 * 가능한 모든 h-index 범위를 찾는 건 맞으나 big,small 카운트 하는 방식이 달라짐
	 */
	int BruteForce_QuickFind() {
		// 초기화 (정렬)
		init(1);
		
		int max_h = 0;
		// h-index의 범위 = 0 ~ len
		for(int h = 0; h <= len; h++) {
			// 연산 횟수 증가
			oper_cnt++;
			
			int big = 0;
			for(int i = 0; i < len; i++) {
				oper_cnt++;
				
				// h보다 같거나 커지는 원소를 발견하면 big,small 대입하고 종료
				if(sort_citations[i] >= h) {
					
					// 정렬되어 있으므로 i번째 이후로는 같거나 큼이 보장됨
					big = len - i;
					break;
				}
			}
			
			// 문제에서 주어진 조건 확인하여 max_h값 갱신
			if(big >= h) max_h = Math.max(max_h, h);
		}
		
		this.answer = max_h;
		disp();
		return max_h;
	}
	
	/*
	 * Sort()
	 * ------------
	 * 정렬 된 배열에서 가능 여부만을 판단하는 방법
	 */
	int Sort() {
		// 초기화 (정렬)
		init(1);
		
		int max_h = 0;
		// h-index의 범위 = 0 ~ len
		for(int i = 0, k = 0; i < len; i++) {
			// 연산 횟수 증가
			oper_cnt++;
			
			// 정렬된 배열에서 i번째 인덱스에 위치한 원소의 값을 토대로 계산
			// x = 배열에서의 i번째 원소
			// k = len - i (i에서 가능한 h-index의 최대값)
			// 
			// arr = [0, 0, 2, 3, 4] 인 경우
			// h = 1이라 가정했을 때 x = 0 (arr[i]), k = 4 (5 - i)
			// 최대 h-index는 4가 나올 수 있음. (현 위치 이후로 모두 4 이상인 경우)
			// 따라서 k 가 x 보다 같거나 작은 경우 최대 h-index값은 k
			
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
