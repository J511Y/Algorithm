package programmers;

public class prgmers_60057 {
	/*
	 len = �Է� ���ڿ��� ����
	 half = �Է� ���ڿ� ������ ���ݱ����� Ȯ���� ����. 
	(������ �Ѿ ���� ���� �Ұ�)

	 minLen = return ���� �ּұ���
	 cnt = �ߺ� Ƚ��
	 i = ���ڿ��� �ڸ��� ����. (i = 3 �̶�� 3���� ��� ����)
	 j = ���ڿ� üũ ������
	 compressLen = i ���� �����Ͽ��� �� ������ ����

	last = ���� �ֱٿ� Ȯ���� �ܾ�
	next = ���� Ȯ���� �ܾ�
	*/

	    // int�� ���� i�� �ڸ����� ���ִ� ����Լ�
	    int len(int i){
	        if(i < 10) return 1;
	        return 1 + len(i / 10);
	    }

	    public int solution(String s) {
	        int len = s.length();
	        int half = len / 2;
	        int minLen = 1000; // len�� �ִ� 1000���� ����
	        int cnt, j, compressLen; // ���� �ϰ� �ʱ�ȭ�� ���� ����



	        if(len == 1) return 1; // ���� ó��

	        // 1���� half�� ���� ������ 1�� �÷����� ����
	        for(int i = 1 ; i <= half; i++){ 

	            // �ʱⰪ ����
	            String last = s.substring(0, i);
	            compressLen = 0;
	            cnt = 1;
	            j = i;

	            // �ڸ� �� �ִ� ���� ������ Ȯ��.
	            for(; j + i <= len; j += i){
	                String next = s.substring(j, j + i);

	                // ���� ���ڿ��� ���� �ֱ��� ���ڿ��� ���ٸ� �ߺ� Ƚ�� ����
	                if(last.equals(next)) cnt++;
	                else{
	                // ���� �ٸ� �� 2������ ��쿡 ���� ��ó. (�ߺ��� �־�����)
	                    compressLen += i + (cnt == 1 ? 0 : len(cnt));
	                    cnt = 1; // �ʱ�ȭ
	                    last = next; // �ʱ�ȭ
	                }
	            }
	            // ������ ���ڿ��� ��� �ݿ��� �ȵ����Ƿ� �� �� �� Ȯ��
	            // + ��ó �ڸ��� ���� ���ڰ� �������� ��� �״�� ���� ����.
	            compressLen += i + (cnt == 1 ? 0 : len(cnt)) + (j == len ? 0 : len - j);

	            // �ּұ��� ����
	            minLen = Math.min(minLen, compressLen);
	        }
	        return minLen;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
