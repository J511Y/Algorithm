package workspace;
import java.util.*;
import java.io.*;
class algo_study_week2 {
	public static void main(String[] a) throws Exception {
		/*
		 * ù �õ�. �޸� �ʰ� �߻�. �־��� ��� 50���� replace �ؾ� �ż� �׷���..?
		 */
//		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String boom = br.readLine();
//        while (str.contains(boom)) str = str.replaceAll(boom, "");
//        if (str.equals("")) System.out.println("FRULA");
//        else System.out.println(str);
		
		/*
		 * �ι�° �õ�. StringBuffer �� ��� append�� �ϸ鼭 ������ boom.length ��ŭ�� String�� boom�� ���� �� Ȯ���ϴ� �˰���
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String boom = br.readLine();
		int len = boom.length();
		int sbLen;
		StringBuffer sb = new StringBuffer(); // ����� �������� StringBuffer
		for( byte b : str.getBytes() ) {
			sb.append((char)b);
			sbLen=sb.length();
			if(sbLen>=len) {
				String last = sb.substring(sbLen-len);
				if(last.equals(boom)) sb.delete(sbLen-len,sbLen);				
			}
		}
		str = sb.toString();
		if (str.equals("")) System.out.println("FRULA");
		else System.out.println(str);
	}
}
