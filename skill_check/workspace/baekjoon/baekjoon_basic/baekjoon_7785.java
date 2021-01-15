package baekjoon_basic;
import java.util.*;
import java.io.*;
public class baekjoon_7785 {
	public static void main(String[] args) throws Exception{
		// �Է��� �޾��� BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n���� �Է��� ����
		int n = Integer.parseInt(br.readLine());
		
		// �ٹ� ���¸� �������� Set
		Set<String> set = new HashSet<>();
		
		// n���� �Է�
		for(int i = 0; i < n; i++) {
			// input[0] = �̸�, input[1] = ����� ����
			String[] input = br.readLine().split(" ");
			if(input[1].equals("enter")) set.add(input[0]);
			else set.remove(input[0]);
		}
		
		// ���� Set�� index�� ������ ���� list (������ ����)
		List<String> list = new ArrayList<>();
		
		// list�� set�� �־���
		list.addAll(set);
		
		// ���� (����)
		list.sort((a, b)->{return b.compareTo(a);});
		
		// list�� ���� ��� String�� ���ʷ� �湮�ϴ� ������ for��
		for(String s : list) System.out.println(s);
	}
}
