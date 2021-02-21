package programmers;

public class prgmers_60057 {
	/*
	 len = 입력 문자열의 길이
	 half = 입력 문자열 길이의 절반까지만 확인할 예정. 
	(절반을 넘어선 순간 압축 불가)

	 minLen = return 해줄 최소길이
	 cnt = 중복 횟수
	 i = 문자열을 자르는 단위. (i = 3 이라면 3개씩 끊어서 압축)
	 j = 문자열 체크 시작점
	 compressLen = i 개로 압축하였을 때 나오는 길이

	last = 제일 최근에 확인한 단어
	next = 다음 확인할 단어
	*/

	    // int형 변수 i의 자릿수를 세주는 재귀함수
	    int len(int i){
	        if(i < 10) return 1;
	        return 1 + len(i / 10);
	    }

	    public int solution(String s) {
	        int len = s.length();
	        int half = len / 2;
	        int minLen = 1000; // len이 최대 1000까지 들어옴
	        int cnt, j, compressLen; // 선언만 하고 초기화는 아직 안함



	        if(len == 1) return 1; // 예외 처리

	        // 1부터 half개 까지 단위를 1씩 늘려가며 압축
	        for(int i = 1 ; i <= half; i++){ 

	            // 초기값 세팅
	            String last = s.substring(0, i);
	            compressLen = 0;
	            cnt = 1;
	            j = i;

	            // 자를 수 있는 범위 까지만 확인.
	            for(; j + i <= len; j += i){
	                String next = s.substring(j, j + i);

	                // 다음 문자열과 가장 최근의 문자열이 같다면 중복 횟수 증가
	                if(last.equals(next)) cnt++;
	                else{
	                // 서로 다를 때 2가지의 경우에 따라 대처. (중복이 있었는지)
	                    compressLen += i + (cnt == 1 ? 0 : len(cnt));
	                    cnt = 1; // 초기화
	                    last = next; // 초기화
	                }
	            }
	            // 마지막 문자열의 경우 반영이 안됐으므로 한 번 더 확인
	            // + 미처 자르지 못한 문자가 남아있을 경우 그대로 갖다 붙임.
	            compressLen += i + (cnt == 1 ? 0 : len(cnt)) + (j == len ? 0 : len - j);

	            // 최소길이 갱신
	            minLen = Math.min(minLen, compressLen);
	        }
	        return minLen;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
